package homework520;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("请输入年龄：");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		while (true) {
			try {
				String[] AgeName = {"儿童","少年","青少年","青年","壮年"
						,"中年","中老年","老年","老老年","老老老年"};
				int rangeAge = age/10;
				System.out.println(AgeName[rangeAge]);
 			} catch (Exception e) {
				System.out.println("输入年龄错误重新输入");
			}
			break;
		}
	}
}
