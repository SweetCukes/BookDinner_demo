package Test1;

public class Main2 {
	public static void main(String[] args) {
		Test2 test1 = new Test2("1", 1000);
		Test2 test2 = new Test2("2", 2000);
		Test2 test3 = new Test2("3", 3000);
		test1.run();
		test2.run();
		test3.run();
	}
}
