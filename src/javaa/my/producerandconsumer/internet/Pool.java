package javaa.my.producerandconsumer.internet;
import java.util.Arrays;
import java.util.Random;

public class Pool {
	/* 篮子的大小 */
	private int maxSize;
	/* 用来存放苹果的数组 */
	private Object[] data;
	/* 最上面苹果的位置 */
	private int top;
 
	/* 构造方法 */
	public Pool(int maxSize) {
		this.maxSize = maxSize;
		this.data = new Object[maxSize];
		this.top = -1;
	}
 
	/**
	 * 从篮子拿出一个苹果
	 * @param eaterName 苹果消费者的名字
	 * @return
	 */
	public synchronized Object eat(String eaterName) {
		/* 如果篮子为空就等到篮子有苹果为止 */
		while (this.isEmpty()) {
			System.out.println("篮子空了++++++++++消费者"+eaterName+"得等一下再吃了");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		Object object = data[top];
		data[top]=null;
		System.out.println(eaterName+"吃了"+object);
		top--;
		return object;
	}
 
    /**
     * 添加苹果
     * @param object 苹果
     * @param name 生产者的名称
     * @return
     */
	public synchronized boolean add(Object object,String name) {
		/* 如果篮子满了就等到篮子可以放苹果为止 */
		while (this.isFull()) {
			System.out.println("篮子满了-----------生产者"+name+"要等一下再生产");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		if (object != null) {
			this.top++;
			data[top] = object;
			this.show();
			return true;
		}
		return false;
	}
 
	/* 判断篮子是否为空 */
	private boolean isEmpty() {
		return this.top == -1;
	}
 
	/* 判断篮子是否满了 */
	private boolean isFull() {
		return this.top == maxSize - 1;
	}
	
	private void show(){
		System.out.println("篮子里面的苹果:"+Arrays.toString(data));
	}
 
	public static void main(String[] args) {
		/* 创建装苹果的篮子 */
		Pool pool = new Pool(5);
		/* 创建两个生产者，生产的苹果放pool这个篮子，满了就不能再生产得等 */
		BunHandler bunProducer1 = new BunProducer(pool,"A");
		BunHandler bunProducer2 = new BunProducer(pool,"B");
		/* 创建3个消费者，吃pool篮子里面的苹果，篮子如果没有苹果得等 */
		BunHandler bunCustomer1 = new BunCustomer(pool,"a");
		BunHandler bunCustomer2 = new BunCustomer(pool,"b");
		BunHandler bunCustomer3 = new BunCustomer(pool,"c");
		/* 生产者开始生产苹果 */
		bunProducer1.start();
		bunProducer2.start();
		/* 消费者开始吃苹果 */
		bunCustomer1.start();
		bunCustomer2.start();
		bunCustomer3.start();
	}
}
 
/* 生产者：生产苹果的生产者 */
class BunProducer extends BunHandler {
 
	/* 构造方法 */
	public BunProducer(Pool pool, String name) {
		super(pool, name);
	}
 
	/**
	 * 随机时间生产苹果
	 */
	@Override
	void toDo() {
		try {
			while (true) {
				this.pool.add("苹果" + name,name);
				Thread.sleep(this.random.nextInt(2000) + 1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
 
/* 消费者：吃苹果的消费者 */
class BunCustomer extends BunHandler {
	/*构造方法*/
	public BunCustomer(Pool pool, String name) {
		super(pool, name);
	}
	/**
	 * 如果篮子没空的话1到3秒随机时间吃一个
	 */
	@Override
	void toDo() {
		try {
			while (true) {
				this.pool.eat(this.name);
				Thread.sleep(this.random.nextInt(4000) + 2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
 
/*跟苹果有关的抽象对象*/
abstract class BunHandler extends Thread {
	/* 用来产生随机时间 */
	Random random = new Random();
	/* 从指定篮子拿苹果 */
	Pool pool;
	/* 名称 */
	String name;
	/**
	 * 
	 * @param pool 篮子
	 * @param name  有关对象的名称
	 */
	public BunHandler(Pool pool, String name) {
		this.pool = pool;
		this.name=name;
	}
 
	@Override
	public void run() {
		this.toDo();
	}
 
	abstract void toDo();
}
