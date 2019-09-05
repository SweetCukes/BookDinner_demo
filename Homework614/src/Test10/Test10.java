package Test10;

public class Test10 {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer('a');
		StringBuffer b = new StringBuffer('b');
		operate(a,b);
		System.out.println(a+","+b);
	}

	private static void operate(StringBuffer x, StringBuffer y) {
		x.append(y);
		y = x;
	}
}
