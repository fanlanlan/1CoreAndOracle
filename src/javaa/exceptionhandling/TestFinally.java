package javaa.exceptionhandling;

public class TestFinally {
	public static void main(String[] args) {
	System.out.println(getNum(0));	
	System.out.println(getNum(1));	
	System.out.println(getNum(2));	
	System.out.println(getNum(3));	

	} 

	public static int getNum(int i) {
		try {
			if(i==0){ 
				System.out.println("----------");
				return 0;
			}
			else{ 
				return 1;
				}
		} catch (Exception e) {
			return 2;
		}finally{
			System.out.println("In finally");
		}
	}

}
