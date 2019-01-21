package javaa.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("zhangsan",16);
		m.put("lisi", 20);
		m.put("wangwu", 18);
		System.out.println("=====================");
		Scanner s=new Scanner(System.in);
		int key=s.nextInt();
		System.out.println(m.get(key));
		
		
		System.out.println("=======key遍历(keyset())=============");
		Set<String> keyset=m.keySet();   //返回所有的key放入set集合
		for(String kk:keyset){
			System.out.println(kk+m.get(kk));//通过key拿到value值
		}
		
		System.out.println("==========value遍历(values())==============");
		Collection<Integer> values=m.values();
		for(int v:values){
			System.out.println(v);
		}
		
		
		
		System.out.println("=========entry遍历===========");
		Set<Map.Entry<String, Integer>> entry=m.entrySet();//获取所有键值对对象
		for(Map.Entry<String, Integer> e:entry){
			System.out.println(e);
		}
	
	}
}
