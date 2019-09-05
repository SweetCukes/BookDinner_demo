package Test1;

public class GetClassDemo2 {

	class S{
		
	}
	public static void main(String[] args) {
		Class<?> c1 = null;
		Class<?> c2 = null;
		Class<?> c3 = null;
		try {
			c1 = Class.forName("Test1类的");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		c3 = S.class;
	}
}
