package javaa.collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SortedSet<String> ss=new TreeSet<String>();
		ss.add("haha");
		ss.add("hehe");
		ss.add("xixi");
		ss.add("gege");
		Iterator<String> it=ss.iterator();
		while (it.hasNext()) {
			String sss=it.next();
			System.out.println(sss);
		}
	}

}
