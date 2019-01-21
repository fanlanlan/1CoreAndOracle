package javaa.exceptionhandling;
public class Test2 {
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
		System.out.println("f2 begin");
		f3();
		System.out.println("f2 end");
	}
	private static void f3() {
		System.out.println("f3 begin");
		System.out.println(3/0);//此处当被除数为double类型时，便可运算，值为Infinity即无穷大
		System.out.println("f3 end");
	}
}
