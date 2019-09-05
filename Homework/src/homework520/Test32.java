package homework520;

import java.util.Scanner;

public class Test32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入温度：");
		double x = scanner.nextDouble();
		if (x<10) {
			char ch = 'a';
		}else if (x<25) {
			char ch = 'b';
		}else if (x<35) {
			char ch = 'c';
		} else {
			char ch = 'd';
		}
		
		int ch = 1;
		switch (ch ) {
		case 'a':
			System.out.println("冷！");
			break;
		case 'b':
			System.out.println("舒服！");
			break;
		case 'c':
			System.out.println("有点热");
			break;
		default:
			System.out.println("热死了");
			break;
		}
			
	}
}
