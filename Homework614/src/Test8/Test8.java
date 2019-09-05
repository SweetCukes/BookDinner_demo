package Test8;

public class Test8 {
	private static int x=100;
	public static void main(String[] args) {
		Test8 hs1 = new Test8();
		hs1.x++;
		Test8 hs2 = new Test8();
		hs2.x++;
		hs1 = new Test8()	;
		hs1.x++;
		Test8.x++;
		System.out.println("X:"+x);
		//x是静态变量
	}
}
