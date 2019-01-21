package javaa.reflex;

import java.lang.reflect.Method;

public class TestNew {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("udp.Student");
		//创建实例对象
		Object o = c1.newInstance();
		//获得方法对象
		Method m = c1.getDeclaredMethod("Study");
		//设置方法的访问权限
		m.setAccessible(true);
		//执行对象的方法
		m.invoke(o);
	}
}
