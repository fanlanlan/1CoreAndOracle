package javaa.tiger;

public class TestVarArgs {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		method();
		method("1");
		method("22","22");
		method("333","333","333");
		method("4444","4444","q","w","e");
		method("55555","5^&","*(","WER");
		method("666666");
	}
	
	private static void method(String...str) {
		System.out.println(str.length);		
	}

}
