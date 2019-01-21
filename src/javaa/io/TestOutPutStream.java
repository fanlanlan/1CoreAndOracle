package javaa.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *    字节流----》写
 * 1.向文件中写入一个字符A
 * 2.向文件中写hello world字符串
 */
public class TestOutPutStream {
	public static void main(String[] args) {
		String str = "hello world";
		OutputStream os = null;
		try {
			os = new FileOutputStream("E://BaiduNetdiskDownload/1.java");
			// os.write('A');
			// 将字符串转换成数组 String---->byte[] bs
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null)
					os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
