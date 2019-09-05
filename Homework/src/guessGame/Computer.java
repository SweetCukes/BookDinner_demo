package guessGame;

public class Computer {
	String name = "电脑玩家";
	int score = 0;
	
	/* 电脑出拳 123 */
	public int punches() {
		
		int num = 0;
		num = (int)((Math.random()*10)%3+1);
		if (num == 1) {
			System.out.println("电脑出拳：剪刀");
		}else if (num ==2) {
			System.out.println("电脑出拳：石头");
		}else if (num ==3) {
			System.out.println("电脑出拳：布");
		}
		return num;
		
	}
}
