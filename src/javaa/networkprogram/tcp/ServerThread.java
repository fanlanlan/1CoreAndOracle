package javaa.networkprogram.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// 启动一个进程，绑定一个端口，等待客户接入ServerSocket
		ServerSocket ss = new ServerSocket(6666);
		while (true) {
			// 等待接入，阻塞方法
			Socket s = ss.accept();
			MyThread t = new MyThread(s);
			t.start();
		}
	}
}

class MyThread extends Thread {
	Socket s;

	MyThread(Socket s) {
		this.s = s;
	}

	public void run() {
		try {
			InputStream is = s.getInputStream();
			byte[] bs = new byte[3];
			is.read(bs);
			System.out.println("服务器接收到数据：" + new String(bs));

			OutputStream os = s.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			pw.println("HelloClient");
			pw.flush();
			if (!s.isClosed())
				s.close();// 没有关闭连接时再关掉连接
		} catch (Exception e) {
		}

	}
}
