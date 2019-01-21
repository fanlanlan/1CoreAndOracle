package javaa.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class TestObject {
	/**
	 * 对象序列化
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args){
		Student s1=new Student("范兰兰",18,100);
		Student s2=new Student("兰范兰",20,200);
		//将Student对象写入到文件中
		//1.创建节点流
		//2.封装过滤流
		ObjectOutputStream oos=null;
		try {
			OutputStream os=new FileOutputStream("E://BaiduNetdiskDownload/4.java");
			oos = new ObjectOutputStream(os);
			//3.读写数据
			oos.writeObject(s1);
			
			//克隆
			Student s = (Student) s1.clone();
			oos.writeObject(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
		//4.关闭流
		try {
			if(oos!=null)
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		//将文件中的对象把字节流转换为字符流，通过桥转换读出来
		//2.封装过滤流
		ObjectInputStream ois = null;
		//3.输入输出数据
		Student s11 = null;
		Student s22 = null;
		try {
			//1.创建字节流
			InputStream is=new FileInputStream("E://BaiduNetdiskDownload/4.java");
			ois = new ObjectInputStream(is);
			s11 = (Student) ois.readObject();
			
			s22 = (Student) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
		//4.关闭流
		try {
			if(ois!=null)
			ois.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println(s11);
		System.out.println(s22);
	}
}
class Student implements Serializable,Cloneable{//接口Serializable是接口序列化
	private String name;
	private int age;
	private transient double  score;//transient不参与序列化
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score
				+ "]";
	}
	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public Object clone(){
		
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
