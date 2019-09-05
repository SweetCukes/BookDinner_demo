package Test1;

public class student {
	private int id;
	private String name;
	private int number;
	private int age;
	public student(int id,String name,int number,int age) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
