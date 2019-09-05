package homework516;

public class Test2 {
	public static void  main(String[] args) {
		int sum=0,m=0;;

		Long startTime = System.nanoTime();
		for (int i = 7; i < 10000; i+=7) {
			sum+=i;
			m++;
		}
	System.out.println("7的倍数整数个有："+m+"个");
	System.out.println("总和为:"+sum);
	System.out.println("用时："+(System.nanoTime()-startTime));
	}
}
