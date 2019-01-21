package javaa.exceptionhandling;

public class TestTryCatch {

	public static void main(String[] args) {
		System.out.println("main begin");
		f1();
		System.out.println("main end");
		
	}
	private static void f1() {
		System.out.println("f1 begin");		
		f2();
		System.out.println("f1 end");
	}
	private static void f2() {
		System.out.println("f1 begin");
		f3();
		System.out.println("f2 end");
	}
	private static void f3() {
		System.out.println("f3 begin");
		try {
			throw new ClassNotFoundException();//抛出一个异常对象
		} catch (ClassNotFoundException e) {
			System.out.println("我已经把异常处理了");
		}
		System.out.println("f3 end");
	}

}
