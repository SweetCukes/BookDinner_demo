package homework520;

import java.util.Scanner;

public class Test31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入温度：");
		double c = scanner.nextDouble();
		if (c<10) {
			System.out.println("冷！");
		}else if (c<25) {
				System.out.println("天气合适");
				
		}else if (c<35) {
			System.out.println("有点热");
		} else {
			System.out.println("热死了");
		}
			
		{
				
			}
	}
}
	

