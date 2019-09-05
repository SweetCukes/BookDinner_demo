package Test3;

import java.lang.reflect.Constructor;

public class InstanceDemo01 {
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			 c = Class.forName("Test3.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
		Person per = null;
		Constructor<?> cons[] = null;
		cons = c.getConstructors();
		try {
			per = (Person) cons[0].newInstance("李白",30);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(per);
	}
}
