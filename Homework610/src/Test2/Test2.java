package Test2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		
	List list1 = new ArrayList();
	List list2 = new ArrayList();
	
	list1.add("a");
	list1.add("b");
	list1.add("c");
	list1.add("d");
	list1.add("e");
	
	list2.add("d");
	list2.add("e");
	list2.add("f");
	list2.add("g");
	list2.add("h");
	
	System.out.println("集合1："+list1);
	System.out.println("集合2："+list2);
	
	list1.removeAll(list2);
	list1.addAll(list2);
	System.out.println(list1);
//	
//	List<Integer> list3 = new ArrayList<Integer>();
//	list3.addAll(list1);
//	list3.addAll(list2);
//	list3 = new ArrayList(new LinkedHashSet<>(list3));
//	
//	System.out.println("集合1："+list1);
//	System.out.println("集合2："+list2);
//	System.out.println("合并集合3："+list3);
	
	
	}
	
}
