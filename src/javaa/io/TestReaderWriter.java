package javaa.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class TestReaderWriter {
	/**
	 * 字符流用法------》常用（桥转换）
	 *（当需要指定的编码时用桥转换--即将字节流转换成字符流）
	 */
	@SuppressWarnings("resource")
	//写
	public static void main(String[] args){
	OutputStream fos = null;
	try {
		fos = new FileOutputStream("E://BaiduNetdiskDownload/3.java");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//Writer w=new OutputStreamWriter(fos,"Big5");//桥转换,指定用gbk写，指定具体的编解码方式
	PrintWriter pw = new PrintWriter(fos);//缓冲流,可直接缓冲
	pw.println("床前明月光");
	pw.println("疑是地上霜");
	pw.println("举头望明月");
	pw.println("低头思故乡");
	pw.close();
	//读
	BufferedReader br=null;
	try {
		InputStream is = new FileInputStream("E://BaiduNetdiskDownload/3.java");
		Reader r = new InputStreamReader(is,"Big5");//桥转换，指定用big5读
		br = new BufferedReader(r);
		while(true){
			String str=null;
			try {
				str = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(str==null){
				break;
			}
			System.out.println(str);
			}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
	
	try {
		if(br!=null)
		br.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}

}
