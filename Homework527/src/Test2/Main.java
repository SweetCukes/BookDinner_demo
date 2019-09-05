package Test2;

public class Main {

	public static void main(String[] args) {
		PersonDirector per = new PersonDirector();
		Person person = per.constructPerson(new ManBuilder());
		System.out.println(person.getHead());
		System.out.println(person.getBody());
		System.out.println(person.getFoot());
	}
}
