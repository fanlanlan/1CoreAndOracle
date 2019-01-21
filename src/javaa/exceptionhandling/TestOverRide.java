package javaa.exceptionhandling;

import java.io.IOException;

public class TestOverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
class supper{
	supper() throws IOException{
	}
	
}
class sub extends supper{

	sub() throws IOException, ClassNotFoundException{//子类要继承父类抛错
		super();
	}
	
}