package javaa.my.test;
/**
 * set和get
 *
 */
public class practiceSetGet {
	private String name;
	private int age;
	private double sex;
	public void getName(String name){
		this.name=name;
	}
	public String setName(){
		return name;
	}
	public void getAge(int age){
		this.age=age;
	}
	public int setAge(){
		return age;
	}
	public void getSex(double sex){
		this.sex=sex;
	}
	public double setSex(){
		return sex;
	}
}
