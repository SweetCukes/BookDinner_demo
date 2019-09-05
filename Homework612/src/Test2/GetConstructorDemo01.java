package Test2;

import java.lang.reflect.Constructor;

public class GetConstructorDemo01 {
	public static void main(String[]	 args) {
		Class<?> c1 = null;
		try {
			c1 = Class.forName("Test2.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?> con[] = c1.getConstructors();
		for (int i = 0; i < con.length; i++) {
			System.out.println("构造方法:" + con[i]);
		}
	}
}
