package javaa.tiger;

import java.util.Scanner;

public class TestOutIn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//格式化输入
		Scanner sc=new Scanner(System.in);
		int haha=sc.nextInt();
		
		//输出
		String name="fanlanlan";
		int age=18;
		System.out.println("my name is "+name+", my age is "+age);
		//格式化输出
		System.out.printf("my name is %s, my age is %d",name,age);
		
		
		

	}

}
