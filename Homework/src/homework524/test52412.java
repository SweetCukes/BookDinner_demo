package homework524;

public class test52412 {
	public static void main(String[] args) {
		int i = 0,sum = 0;
		long strartTime = System.nanoTime();
		while(i<=1000) {
			sum = sum +i;
			i++;
		}
		System.out.println(sum);
		long endTime = System.nanoTime();
		System.out.println("程序运行时间："+(endTime-strartTime)+"ns");
	}
}
