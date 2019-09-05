package Homework1;

import java.lang.reflect.Constructor;

public class GetDemo {
		public static void main(String[] args) {
			Class<?> c = null;
			try {
				 c = Class.forName("Homework1.Student");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				}
			Student stu = null;
			try {
				stu = (Student) c.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
			stu.setAge(18);
			stu.setName("李白");
			System.out.println(stu);
		}
}
