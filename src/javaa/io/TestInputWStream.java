package javaa.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *     字节流------》读
 * 1.读取文件中的一个字节 2.读取文件中的全部字节 3.读取文件中的部分字节
 */
public class TestInputWStream {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("E://BaiduNetdiskDownload/1.java");
			// 1.从文件中读一个字节
			/*
			 * while(true){ int i=is.read(); if(i==-1) break; else
			 * System.out.print((char)i); } System.out.println();
			 */
			// 2.从文件中读全部字节
			/*
			 * byte[] bs=new byte[6]; while(true){ int i=is.read(bs); if(i==-1)
			 * break; for(byte b:bs){ System.out.print((char)b+" "); }
			 * System.out.println(i); }
			 */
			// 3.从文件中读部分字节
			byte[] bs = new byte[6];
			while (true) {
				int i = is.read(bs, 1, 2);
				if (i == -1)
					break;
				for (byte b : bs) {
					System.out.print((char) b + "");
				}
				System.out.println(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
