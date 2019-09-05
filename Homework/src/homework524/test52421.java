package homework524;

public class test52421 {
	public static void main(String[] args) {
		plus();
		concat();
		Builder();
	}
	
	public static void plus() {
		String a = "";
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			a = a + "a";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("加号耗时："+(endTime-startTime));
	}
	
	public static void concat() {
		String b = "";
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			b = b.concat("d");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("concat耗时："+(endTime-startTime));
		
	}
	
	public static void Builder() {
		long startTime = System.currentTimeMillis();
		StringBuilder c1 = new StringBuilder("c1");
		for (int i = 0; i < 100000; i++) {
			c1.append("c");
		}
		long endTimes = System.currentTimeMillis();
		System.out.println("Builder耗时："+(endTimes-startTime));
	}
	
	
}
