package javaa.thread;
public class TestThread1 {
	public static void main(String[] args) {
		Thread1 th1=new Thread1();
		th1.start();
		Thread2 target=new Thread2();
		Thread th2=new Thread(target);
		th2.start();
		try {
			th1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("++++++++++"+i);
		}
	}
}
class Thread1 extends Thread{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("********"+i);
		}
	}
}
class Thread2 implements Runnable{
	@Override
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("========"+i);
		}
}
}