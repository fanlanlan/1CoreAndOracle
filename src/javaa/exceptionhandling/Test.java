package javaa.exceptionhandling;

public class Test {
	public static void main(String[] args) {
		System.out.println(getNum(0));//3
		System.out.println(getNum(1));//1
		System.out.println(getNum(2));//4
		System.out.println(getNum(3));//2
	}
	public static int getNum(int i){
		try{
			if(i==1)return 1;
			if(i==0){
				System.out.println(1/i);
			}
			return 2;
		}catch(Exception e){
			return 3;
		}finally{
			System.out.println("In finally");
			if(i==2)return 4;
		}
	}
}
