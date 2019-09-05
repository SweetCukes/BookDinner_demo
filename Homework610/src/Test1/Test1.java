package Test1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		System.out.println(list);
		
		List list2 = new ArrayList();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		
		List list3 =new ArrayList();
		list3.add("a");
		list3.add("b");
		list3.add("z");
		list3.add("1");
		
		list2.retainAll(list3);
		list.addAll(list);
		list3.removeAll(list);
		
		
		System.out.println("交集是：" +list2);
		System.out.println("并集是："+list);
		System.out.println("差集是："+list3);
		
		List list4 =new ArrayList();
		list4.add("a");
		list4.add("b");
		list4.add("c");
		
		List list5 =new ArrayList();
		list5.add("a");
		list5.add("b");
		list5.add("e");
		
		list5.addAll(list4);
		list4.removeAll(list5);
		
		
		System.out.println("无重复并集是："+list4);
	}
}
