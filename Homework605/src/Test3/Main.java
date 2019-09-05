package Test3;

public class Main {
	public static void main(String[] args) {
		
		Test1 mt = new Test1();
		
		Thread mt1 = new Thread(mt,"前门");
		Thread mt2 = new Thread(mt,"后门");
		mt1.start();
		mt2.start();
	}
}
