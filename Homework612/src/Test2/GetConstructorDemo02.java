package Test2;

import java.lang.reflect.Constructor;

public class GetConstructorDemo02 {
	public static void main( String[] args) {
		Class<?>  c1  =  null;
		try {
			c1 = Class.forName("Test2.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Constructor<?> con[] = c1.getConstructors();
		for (int i = 0; i < con.length; i++) {
			Class<?> p[]  = con[i].getParameterTypes();
			System.out.println("构造方法：");
			System.out.println(con[i].getModifiers()+"");
			System.out.println(con[i].getName());
			System.out.println("(");
			for (int j = 0; j < p.length; j++) {
				System.out.println(p[j].getName() + "arg"  + i);
				if (j < p.length-1) {
					System.out.println("，");
				}
			}
			System.out.println("){}");
		}
	}
}
