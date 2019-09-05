package Test1;

public class Main1 {

	public static void main(String[] args) {
		Test1 test1 = new Test1("1", 1000);
		Test1 test2 = new Test1("2", 2000);
		Test1 test3 = new Test1("3", 3000);
		test1.start();
		test2.start();
		test3.start();
	}
}
