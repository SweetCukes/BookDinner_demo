package homework515;

public class BooleanTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("start:" + start);
		for (int i = 0; i < 999999999; i++) {
			isOdd(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("time:"+(end-start));
	}
	public static boolean isOdd(int i) {
		return !(i%2 == 0);
		//return (i&1) == 1;
	}
}
