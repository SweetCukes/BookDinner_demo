package homework524;

public class test52411 {
	public static void main(String[] args) {
		int count = 0;
		long strartTime = System.nanoTime();
		for (int i = 0; i <=1000; i++) {
			count=count+i;
		}
			System.out.println(count);
			long endTime = System.nanoTime();
			System.out.println("程序运行时间："+(endTime-strartTime)+"ns");
	}
}
