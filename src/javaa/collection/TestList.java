package javaa.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**C:\Program Files\Java\jdk1.7.0_45\jre\bin
 * 1.list的特点：有顺序、可重复
 * 2.list方法 list.add
 * 3.list的遍历
 * 4.list的实现类      1)ArrayList------------->查询快、修改慢
 *              2)vector
 *              3)LinkedList------------>栈 查询慢、修改快
 */
/**
 * @author Administrator（快捷键   alt+shift+j）
 *                       运行快捷键    alt+shift+x  和alt+shift+d
 *                       
 *
 */
public class TestList {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("changfei");
		list.add("chengyangyang");
		list.add("chenfeifan");
		System.out.println("=====for循环遍历=====");
		//size()   长度
		for (int i = 0; i < list.size(); i++) {
			//get()  查询方法
			String s=(String) list.get(i);
			//toUpperCase()   转为大写
			System.out.println(s.toUpperCase());
		}		
		System.out.println("=====迭代遍历=========");
		//remove()   删除方法
		list.remove("changfei");
		Iterator it=list.iterator();
		while (it.hasNext()) {
			String s=(String) it.next();
			System.out.println(s);
		}
		System.out.println("======forEach=======");
		//set()   修改
		list.set(1, "fanlanaln");
		list.set(0, "songxiaoge");
		//clear   清除
//		list.clear();
		for(String s:list){
			System.out.println(s);
			new Date();
		}
	}

}
