package javaa.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.text.StyledEditorKit.ItalicAction;

/**
 * Set：
 * 1.特点：无序，不可重复
 * 2.方法：全部继承collection接口
 * 3.遍历：迭代遍历和foreach遍历
 * 4.实现类：hashset    
 * Treeset是sortedset的子接口
 */
public class TestSet1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("shengyin");
		set.add("weihuili");
		set.add("fanlanlan");
		set.add("dongyanyan");
		set.add("liumengchun");
		set.add("zhaoyaqian");
		set.add("liulingling");
		//迭代遍历
		set.remove("dongyanyan");
		set.remove("weihuili");
		Iterator<String> it=set.iterator();
		while (it.hasNext()) {
			String ss=it.next();
			System.out.println(ss);
		}
		System.out.println("=============================" +
				"");
		//foreach遍历
		
		set.clear();
		for (String t:set) {
			System.out.println(t);
		}
	}

}
