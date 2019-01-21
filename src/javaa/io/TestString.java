package javaa.io;

import java.io.UnsupportedEncodingException;

/**
 * 乱码现象：因为编码和解码所用的方式不同
 *
 */
public class TestString {

	public static void main(String[] args){
		String str="我想回家";
		//乱码
		String s=null;
		//不乱码
		byte[] bt1=null;
		try {
			byte[] bt=str.getBytes("gbk");
			s = new String(bt,"big5");
			bt1 = str.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s1=new String(bt1);
		System.out.println(s);
		System.out.println(s1);
	}
}
