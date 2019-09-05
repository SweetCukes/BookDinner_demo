package guessGame;

import java.util.Scanner;

public class Game {

	User user;
	Computer computer;
	int count = 0 ; //对战次数
	Scanner input = null;
	//初始化方法
	private void init() {
		input = new Scanner(System.in);
		user = new User()	;
		computer = new Computer()	;
		System.out.println("请输入用户账号:");
		user.name = input.next();//判断输入是否为空格
		computerSwitch();
		System.out.println("请输入对局次数：");
		count = input.nextInt();
	}
		private void computerSwitch() {
		System.out.println("请选择对手：(1、乔峰 2、虚竹 3、段誉：)");
		String tstr = input.next();
		switch (tstr) {
		case "1":
			computer.name = "乔峰";
			break;
		case "2":
			computer.name = "虚竹";
			break;
		case "3":
			computer.name = "段誉";
			break;
		default:
			System.out.println("电脑玩家与您对战");
			computer.name = "电脑玩家";
			break;
		}
	}
		
	
	
	//开始游戏方法//
	public void startGame() {
		System.out.println("----------------欢 迎 进 入 游 戏 世 界----------------\n");
		System.out.println("\n\t\t******************");
		System.out.println("\t\t**  猜拳, 开始    **");
		System.out.println("\t\t******************");
		//用户输入账号 与电脑选择对手
		init();
		jugdement();
		
		showResult();
		
		}
	
		
	
	
	//计算游戏结果
	public int calcResult() {
		if (user.score == computer.score) {
			return 0;
		}else if (user.score > computer.score) {
			return 1;
		}else {
			return 2;
		}
	}
	
	
	//显示游戏结果
	public void showResult() {
		System.out.println("---------------------------------------------------");
		System.out.println(computer.name + "  VS  " + user.name);
		int result = calcResult();
		System.out.println("赢局次数："+ user.score);
		System.out.println("输局次数："+ computer.score);
		if (result == 0) {
			System.out.println("和局！");
		}
	}
	
	public void jugdement() {
		while(true) {
			//先要求用户出拳或者电脑出拳
			int uFirst = user.punches();
			int cFirst = computer.punches()	;
			if (uFirst == cFirst) {
				System.out.println("和局！");
			}else if ((uFirst==1&&cFirst==3)||(uFirst==2 && cFirst ==1)||(uFirst==3&&cFirst==2)) {
				System.out.println("您赢了！");
				user.score++;
				count--;
			}else {
				System.out.println("你输了！");
				computer.score++;
				count--;
			}
			if (count==0) {
				break;
			}else if (user.score > ((count/2)+1)) {
				System.out.println("比赛提前结束！你赢了！");
				break;
			}else if (computer.score > ((count/2)+1)) {
				System.out.println("比赛提前结束！你输了！");
				break;
			}
		}
	}
}

