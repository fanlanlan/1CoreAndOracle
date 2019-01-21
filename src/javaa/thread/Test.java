package javaa.thread;
public class Test {
	public static void main(String[] args) {
		OurStack m=new OurStack();
		Thread t1=new OurThread1(m);
		Thread t2=new OurThread2(m);
		t2.start();
		t1.start();
	}
}
class OurThread1 extends Thread{
	OurStack m;
	public OurThread1(OurStack m){
		this.m=m;
	}
	public void run(){
		m.pop();
	}
}
class OurThread2 extends Thread{
	OurStack m;
	public OurThread2(OurStack m){
		this.m=m;
	}
	public void run(){
		m.push('c');
	}
}
class OurStack{
	char[] ss={'A','B',' ',' ',' '};
	int index=2;
	public synchronized void push(char c){
		System.out.println(c+"入栈");
		ss[index]='c';
		index++;
	}
	public synchronized void pop(){
		System.out.println(ss[index-1]+"出栈");
		ss[index-1]=' ';
		index--;
	}
	}