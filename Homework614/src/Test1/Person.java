package Test1;



	public class Person implements Cloneable{
		private String name;
		private Person father;
	
	public static void main(String[] args)throws Exception {
		Person f = new Person("爹");
		Person s1 = new Person("大儿子");
		
		Person s2 = (Person)s1.clone();
		s2.setName("小儿子");
	}
}
