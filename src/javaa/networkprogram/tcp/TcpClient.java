package javaa.networkprogram.tcp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * TCP客户端 
 * 1.客户端创建网络对象连接socket 
 * 2.客户端获取网络对象io流，给服务器发数据 （OutputStream）
 * 3.客户端接受服务器应答（InputStream）
 */

public class TcpClient {
	/**
	 * 需要IP port IP :172.21.167.221 /localhost port:6666
	 */
	public static void main(String[] args) throws UnknownHostException,
			Exception {
		// 1.创建网络连接对象socket
		Socket s = new Socket("localhost", 6666);
		// 2.获取网络连接对象中的io流，给服务器发数据（OutputStream）
		OutputStream os = s.getOutputStream();
		byte[] bs = { 66, 67, 68 };
		os.write(bs);
		os.flush();
		// 3.客户端接受服务器应答
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		System.out.println("客户端接受应答：" + str);
		if (s.isClosed())
			s.close();// 如果没有关闭连接，关闭连接
	}
}