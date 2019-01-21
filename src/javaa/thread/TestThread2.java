package javaa.thread;
/**
 * c的入栈和出栈 *
 */
public class TestThread2 {
	public static void main(String[] args) {
		MyStack ms=new MyStack();
		Thread mt1=new MyThread1(ms);
		Thread mt2=new MyThread2(ms);
		mt1.start();
		mt2.start();
	}
}
class MyThread1 extends Thread{
	MyStack ms;
	public MyThread1(MyStack ms){
		this.ms=ms;
	}
	public void run(){
		ms.pop();
	}
}
class MyThread2 extends Thread{
	MyStack ms;
	public MyThread2(MyStack ms){
		this.ms=ms;
	}
	public void run(){
		ms.push('C');
	}
}
class MyStack{
	char[] cs={'A','B',' ',' ',' '};
	int index=2;
	public synchronized void push(char c) {
		System.out.println(c+" 入栈");
		cs[index]=c;
		index++;
	}
	//同步序列化
	public synchronized void pop() {
		System.out.println(cs[index-1]+" 出栈");
		cs[index-1]=' ';
		index--;
	}
}
