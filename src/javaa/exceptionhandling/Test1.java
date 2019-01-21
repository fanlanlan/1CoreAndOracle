package javaa.exceptionhandling;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("begin");
		throw new ClassCastException();
		//System.out.println("end");//得不到编译机,会执行报错
	}

}
