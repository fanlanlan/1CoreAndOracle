package javaa.exceptionhandling;

public class Test3 {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main begin");
		f1();
		System.out.println("main end");
	}
	private static void f1() throws ClassNotFoundException {
		System.out.println("f1 begin");
		f2();
		System.out.println("f1 end");
	}
	private static void f2() throws ClassNotFoundException{
		System.out.println("f2 begin");
		f3();
		System.out.println("f2 end");
	}
	private static void f3() throws ClassNotFoundException {//如果有问题推卸给其他调用方法
		System.out.println("f3 begin");
		throw new ClassNotFoundException();//抛出一个异常对象
		//System.out.println("f3 end");
	}
}
