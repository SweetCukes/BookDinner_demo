package homework523;

public class Test5231 {
	static int n = 0;
	public void test() {
		n++;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Test5231 t1 = new Test5231()	;

		Test5231 t2 = new Test5231()	;
		
		System.out.println(""+Test5231.n+""+Test5231.n);
	}
}
