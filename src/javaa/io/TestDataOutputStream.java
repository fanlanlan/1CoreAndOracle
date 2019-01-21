package javaa.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 节点流和过滤流
 */
public class TestDataOutputStream {

	public static void main(String[] args){
		//读
		Long l=1234567890l;
		DataOutputStream dops = null;
		try {
			OutputStream ops=new FileOutputStream("E://BaiduNetdiskDownload/2.java");
			dops = new DataOutputStream(ops);
			dops.writeLong(l);
			dops.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
				try {
					if(dops!=null)
					dops.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		}
		//输入
/*		InputStream ips=new FileInputStream("E://BaiduNetdiskDownload/2.java");
		DataInputStream dips = new DataInputStream(ips);	
		long l2=dips.readLong();
		dips.close();
		System.out.println(l2);
*/
	}
