package Test2;

public class Main1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.setName("A");
		t2.setName("B");
		
		t1.start();
		t2.start();
	}
}
