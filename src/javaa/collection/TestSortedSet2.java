package javaa.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Emp e1 = new Emp("zhangzhang",17,5000);
		Emp e2 = new Emp("lisi",18,5000);
		Emp e3 = new Emp("wangw",18,4000);
		Emp e4 = new Emp("maliu",18,5000);
		
		SortedSet<Emp> ss=new TreeSet<Emp>();
		ss.add(e1);
		ss.add(e2);
		ss.add(e3);
		ss.add(e4);
		for(Emp e:ss){
			System.out.println(e);
		}
	}
	static class Emp implements Comparable<Emp>{
		private String name;
		private int age;
		private double salary;
		public int compareTo(Emp e){
			//按照年龄先后分
			if(this.age>e.age) return 1;
			if(this.age<e.age) return -1;
			//年龄一样按照工资比较
			if(this.salary>e.salary) return -1;
			if(this.salary<e.salary) return 1;
			//年龄和名称一样按照名称排序
			return this.name.compareTo(e.name);
		}
		@Override
		public String toString() {
			return "Emp [name=" + name + ", age=" + age + ", salary=" + salary
					+ "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Emp(String name, int age, double salary) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
		}
		public Emp() {
			super();
		}
	}
}