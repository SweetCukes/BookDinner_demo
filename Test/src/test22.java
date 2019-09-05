
public class test22 {
	private static int x = 100;
	public static void main(String[] args) {
		test22 ts1 = new test22();
		ts1.x++;
		test22 ts2 = new test22();
		ts2.x++;
		ts1=  new test22();
		ts1.x++;
		test22.x--;
		System.out.println("x="+x);
	}
}
