package Test6;

public class Test6 {
	static final int END = Integer.MAX_VALUE;
	static final int START = END - 100;
	
	public static 	void main	(String[] args) {
		int count = 0;
		for (int i = START; i <=END; i++) {
			count++ ;
		}
		System.out.println(count);
		//程序陷入了死循环，判断条件永远为真。
	}
}
