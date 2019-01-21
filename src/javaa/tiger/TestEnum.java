package javaa.tiger;
import static java.lang.System.*;
public class TestEnum {
	public static void main(String[] args) {
		season1 spring=season1.Spring;
		season2 summer=season2.summer;
		season2[] v = season2.values();
		for(season2 s:v){
			out.println(s.ordinal()+":"+s.name()+"  "+s.getName());
		}
		oparetion[] o = oparetion.values();	
		for(oparetion oo:o){
			System.out.println(oo.calculate(8, 4));
		}
		
	}
}
class season1{
	public static final season1 Spring=new season1("春天"); 
	public static final season1 summer=new season1("夏天");
	public static final season1 autumn=new season1("秋天");
	public static final season1 winner=new season1("冬天");
	private season1(String name){}
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
enum season2{
	spring("春天"),
	summer("夏天"),
	autumn("秋天"),
	winner("冬天");
	String name;
	season2 (String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}
enum oparetion{
	add{
		public double calculate(double a,double b){
			return a+b;
		}
	},
	subtract{
		public double calculate(double a,double b){
			return a-b;
		}
	},
	multiply{
		public double calculate(double a,double b){
			return a*b;
		}
	},
	divide{
		public double calculate(double a,double b){
			return a/b;
		}
	};

	public abstract double calculate(double a,double b);
}