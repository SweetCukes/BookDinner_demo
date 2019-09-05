abstract class animal{
	abstract void say();
}

public class Test14 extends animal{
	public Test14() {
		System.out.println("i am a cat");
	}
	public static void main(String[] args) {
		Test14 cat = new Test14();
	}
	@Override
	void say() {
		// TODO Auto-generated method stub
		
	}
}
