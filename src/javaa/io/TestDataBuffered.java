package javaa.io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 节点流和过滤流
 */
public class TestDataBuffered {

	public static void main(String[] args){
		//读
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("3.java");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedOutputStream bo =new BufferedOutputStream(fos);
		DataOutputStream out=new DataOutputStream(bo);
		
		PrintStream ou=new PrintStream(fos);

	}

}
