import java.util.Scanner;

public class guessGame {
	private static String computer=""; //表示电脑
	private static String person=""; //表示用户
	private static int computerScore=0; //表示电脑成绩
	private static int personScore=0; //表示用户的成绩
	private static int gameCount=0; //表示游戏的次数
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args){
		System.out.println("----------------欢 迎 进 入 游 戏 世 界----------------\n");
		System.out.println("\n\t\t******************");
		System.out.println("\t\t**  猜拳, 开始    **");
		System.out.println("\t\t******************");
		
		System.out.print("\n\n出拳规则：1.剪刀 2.石头 3.布");
		/*选择对方角色*/
		
		
		System.out.print("\n请选择角色：（1.张无忌 2.乔峰 3.令狐冲）");
		
		
		Scanner input = new Scanner(System.in);
		int role = 1;
		while (true) {
			try {
				role = input.nextInt();
				if(role == 1) {
					computer = "刘备";
					person = "张无忌";
				}else {
					if (role == 2) {		
						computer = "孙权";
						person = "乔峰";
					}else {
						if (role == 3) {
							computer = "曹操";
							person = "令狐冲";
						}
					}
				}
				break;
			} catch (Exception e) {
				System.out.print("请正确输入（1~3）：");
				String st = input.next();
			}
		}
		
		

		
		System.out.print("电脑对手是：" + computer);
		
		System.out.print("\n要开始吗？ (y/n)");
		String con = input.next();
		int perFist;  //用户出的拳
		int compFist;   //电脑出的拳
		while (con.equals("y")) {
			perFist = personShowFist(); //用户出拳
			compFist = computerShowFist(); //电脑出拳
			/*裁决*/
			if((perFist == 1 && compFist == 1) || (perFist == 2 && compFist == 2) || (perFist == 3 && compFist == 3)){
				System.out.println("结果:和局\n");  //平局
				//1.剪刀 剪 3.布 赢；|| 2.石头 砸 1.剪刀 赢；|| 3.布 盖 2.石头 赢；
			}else if((perFist == 1 && compFist == 3) || (perFist == 2  && compFist == 1) || (perFist == 3 && compFist == 2)){
				System.out.println("结果：！ 恭喜，你赢了！给力嗷带哥");  //用户赢
				personScore++;
			}else{
				System.out.println("结果说:你输了！真是个憨憨！\n");  //计算机赢
				computerScore++;
			}
			gameCount++;
			System.out.print("\n是否开始下一局？（y）");
			con = input.next();
		}
		/*显示结果*/
		showResult();
		
	}
	
	/*显示比赛结果*/

	private static void showResult() {
		/*显示最后结果*/
		int tiecount;
		tiecount = gameCount-personScore-computerScore;
		System.out.println("---------------------------------------------------");
		System.out.println(computer + "  VS  " + person);
		System.out.println("对战次数："+ gameCount);
		System.out.println("赢局次数："+ personScore);
		System.out.println("输局次数："+ computerScore);
		System.out.println("和局次数："+ tiecount);
		int result = calcResult();
		
		if (result ==1) {
			System.out.print("平局！");
		}else {
		if (result == 2) {
		System.out.print("你赢了！给力嗷带哥");
		}else {
		System.out.print("你输了！真是个铁憨憨");
		}
		}
		
	}

	private static int calcResult() {
		if (personScore == computerScore) {
			return 1; //平局
		}else {
			if (personScore > computerScore) {
				return 2; //自己赢
			}else {
				return 3; //他赢
			}
		}
	}

	/*电脑出拳*/
	private static int computerShowFist() {
		int show = (int)(Math.random() *10) %3 +1; //产生随机数
		switch (show) {
		case 1:
			System.out.print("电脑出拳：剪刀");
			break;
		case 2:
			System.out.print("电脑出拳：石头");
			break;
		case 3:
			System.out.print("电脑出拳：布");
			break;
		}
		return show;
	}

	private static int personShowFist() {
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		System.out.println("\n请出拳： 1.剪刀 2.石头 3.布（输入相应数字）：");
		int show =1;
		while (true) {
			try {
				show = input1.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("请重新输入！");
				@SuppressWarnings("unused")
				String st = input1.next();
			}
			
		}
		switch (show) {
		case 1:
			System.out.println("你出了：剪刀");
			break;
		case 2:
			System.out.println("你出了：石头");
			break;
		case 3:
			System.out.println("你出了：布");
			break;
		default:
			System.out.println("请输入正确的数字！");
			personShowFist();
		}
		return show;
	}
}