package javaa.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User u1 = new User("haha",19);
		User u2 = new User("hehe",18);
		User u3 = new User("xixi",20);
		Set<User> st = new HashSet<User>();
		st.add(u1);
		st.add(u2);
		st.add(u3);
		System.out.println(st.size());
	}
}
class User{
	private String name;
	private int age;
	public int hashcode(){
		System.out.println("user    hashcode      run ");
		return name.hashCode()+age;
	}
	public boolean equals(Object obj){
		System.out.println("user      equals      run ");
		if(this==obj) return true;
		if(obj == null) return false;
		if(this.getClass()!=obj.getClass()) return false;
		User u = (User)obj;
		if(this.name.equals(u.name) && this.age == u.age){
			return true;
		}
		return false;
	}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public User() {
		super();
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}