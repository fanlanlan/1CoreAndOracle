package javaa.my.producerandconsumer.my;

import java.util.Arrays;
import java.util.Random;


public class Poool {
	private int maxsize;
	private Object[] data;
	private int top;
	public Poool(int maxsize){
		this.maxsize=maxsize;
		this.data=new Object[maxsize];
		this.top=-1;
	}
	public synchronized Object decreace(String eatername){
		while(this.isEmpty()){
			System.out.println("篮子空了，消费者"+eatername+"等待吃下一个");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
		Object object=data[top];
		data[top]=null;
		System.out.println(eatername+"吃了"+object);
		top --;
		return object;
}
	public synchronized boolean increace (Object object,String name){
		while(this.isFull()){
			System.out.println("篮子满了"+name+"再等一下再生产");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			this.notify();
			if(object!=null){
				this.top++;
				data[top]=object;
				this.show();
				return true;
			}
			return false;
		}
	private boolean isEmpty() {
		return this.top == -1;
	}
	private boolean isFull() {
		return this.top==maxsize-1;
	}
	private void show() {
		System.out.println("篮子里面苹果"+Arrays.toString(data));
	}
	public static void main(String[] args) {
		Poool poool=new Poool(5);
		Handler con1=new Consumer(poool,"消费者1");
		Handler con2=new Consumer(poool,"消费者2");
		Handler con3=new Consumer(poool,"消费者3");
		
		Handler pro1=new Producer(poool,"生产者1");
		Handler pro2=new Producer(poool,"生产者2");
		
		con1.start();
		con2.start();
		con3.start();
		pro1.start();
		pro2.start();
	}
}
abstract class Handler extends Thread {
	/* 用来产生随机时间 */
	Random random = new Random();
	/* 从指定篮子拿苹果 */
	Poool poool;
	/* 名称 */
	String name;
	/**
	 * 
	 * @param poool 篮子
	 * @param name  有关对象的名称
	 */
	public Handler(Poool poool, String name) {
		this.poool = poool;
		this.name=name;
	}
 
	@Override
	public void run() {
		this.toDo();
	}
 
	abstract void toDo();
}
