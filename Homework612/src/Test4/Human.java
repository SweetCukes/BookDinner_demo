package Test4;

public class Human implements China {

	private String name;
	private int age;
	public Human() {
		
	}
	public Human(String name,int age) {
		this.name  =  name;
		this.age = age;
	}
	@Override
	public void sayChina() {
		System.out.println("作者：" + AUTHOR + "国籍："+NATIOL);
		
	}

	@Override
	public String sayHello(String name, int age) {
		
		return name+",你好，我今年"+ age +"岁";
	}

}
