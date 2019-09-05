package Homework1;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GetDemo2 {
	public static void main(String[] args) {
		Class<?> c1  = null;
		try {
			c1 = Class.forName("Homework1.Student");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		{
			Field f[] = c1.getDeclaredFields();
			for (int i = 0; i < f.length; i++) {
				Class<?> r = f[i].getType();
				int mo = f[i].getModifiers();
				String priv = Modifier.toString(mo);
				System.out.println("本来属性：");
				System.out.println(priv+"");
				System.out.println(r.getName()+"");
				System.out.println(f[i].getName());
				System.out.println(";");
			}
		}
	}
}
