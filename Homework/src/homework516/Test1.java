package homework516;

public class Test1 {
	public static void main(String[] args) {
		int sum=0,add=1000;
		for (int i = 1; i < add; i+=2) {
			sum+=i;
		}
		System.out.println("奇数和为："+sum);
	}
}
