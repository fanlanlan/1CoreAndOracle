package javaa.networkprogram.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
public static void main(String[] args) throws Exception {
	//传真件
	DatagramSocket ds = new DatagramSocket(6666);
	//构建一封空信
	byte[] bs=new byte[100];
	DatagramPacket dp=new DatagramPacket(bs, 0,bs.length);//空信
	//收取  阻塞
	ds.receive(dp);
	int offset = dp.getOffset();
	int length = dp.getLength();
	int port = dp.getPort();
	String hostName = dp.getAddress().getHostName();
	
	System.out.println("服务器接收数据："+new String (bs,offset,length));
	
}
}
