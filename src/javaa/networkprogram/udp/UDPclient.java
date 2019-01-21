package javaa.networkprogram.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPclient {
  public static void main(String[] args) throws Exception{
	String s="Hello world";
	byte[] bs = s.getBytes();
	//邮筒
	DatagramSocket ds = new DatagramSocket();
	//信件   内容IP，InetAdress,port
	DatagramPacket dp = new DatagramPacket(bs, 0, bs.length, InetAddress.getByName("localhost"), 6666);
	ds.send(dp);
  }
}
