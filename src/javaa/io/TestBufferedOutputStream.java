package javaa.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestBufferedOutputStream {
	/**
	 * 缓冲流BufferedOutputStream的使用
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException{
		byte[] b={1,2,3,4,5,6,7,8,9,0};
		OutputStream os = new FileOutputStream("E://BaiduNetdiskDownload/5.java");
		BufferedOutputStream bs=new BufferedOutputStream(os);
		try {
			bs.write(b);
			bs.flush();
			bs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
