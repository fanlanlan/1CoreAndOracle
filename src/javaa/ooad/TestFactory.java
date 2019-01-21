package javaa.ooad;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestFactory {
	public static void main(String[] args) throws Exception {
		Animal a=Factory.createAnimal();
		//System.out.println(a.getClass().getName());
	}
}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
class Factory {
	public static Animal createAnimal() throws Exception{
		FileReader fr=new FileReader("E://BaiduNetdiskDownload/6.java"); 
		BufferedReader bf=new BufferedReader(fr);
		String className = bf.readLine();
		bf.close();
		Class c = Class.forName(className);
		Object o = c.newInstance();
		
		return (Animal)o;
	}
}