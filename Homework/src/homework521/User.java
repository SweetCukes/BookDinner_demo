package homework521;

import java.util.Scanner;

public class User {
	String name = "匿名用户";
	int score = 0;
	
	/* 用户出拳*/
	public int punches() {
		int num;
		System.out.println("请出拳！(1剪刀，2石头，3布)：");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String cqstr = input.next();
		switch (cqstr) {
		case "1":
			System.out.println("你出了：剪刀");
			break;
		case "2":
			System.out.println("你出了：石头");
			break;
		case "3":
			System.out.println("你出了：布");
			break;
		default:
			System.out.println("请输入正确的数字！");
			punches();
			
			break;
		}
		return Integer.parseInt(cqstr);
		
	}
}
