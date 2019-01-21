package javaa.networkprogram.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	/**
	 * 1.服务器端创建网络对象连接ServerSocket 
	 * 2.服务器端等待接入，服务器接收数据，网络连接对象中获得输入流（InputStream）
	 * 3.服务器端回复应答（OutputStream）
	 */
	public static void main(String[] args) throws IOException {
		// 启动一个进程，绑定一个端口，等待客户接入ServerSocket
		ServerSocket ss = new ServerSocket(6666);
		// 等待接入，阻塞办法
		Socket s = ss.accept();
		// 网络连接对象中获得输入流
		InputStream is = s.getInputStream();
		byte[] bs = new byte[3];
		is.read(bs);
		System.out.println("服务器接收数据" + new String(bs));
		// 回复应答
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		pw.print("Hello client");
		pw.flush();
		// 关闭网络连接对象，判断是否已经关闭
		if (s.isClosed())
			s.close();
	}
}