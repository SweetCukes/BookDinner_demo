package test;

public class Game {
	private User user;
	private Computer	computer;
	private int gameCount = 0;
	
	public Game() {
		
	}
	public Game(User user ,Computer computer) {
		super();
		this.user = user;
		this.computer = computer	;
	}
//裁决规则
	public int rule(int perFirst,int comFirst) {
			if (perFirst == comFirst) {
			//	rstlb .setIcon(new ImageIcon("src/test/z.png"));
					return 0;
			}else if ((perFirst == 1 && comFirst ==3)||
							(perFirst == 2 && comFirst ==1)||
								(perFirst == 3 && comFirst ==2)){
										user.score++;
									//rstlb.setIcon(new ImageIcon("src/test/h.png"));
										return 1;
										
			}else  {
				//rstlb.setIcon(new ImageIcon("src/test/w.png"));
				computer.score++;
				return 2;
			}
		}

	
	public void calcResult() {
		
	}
	public void showResult(int perFirst,int comFirst) {
		
	}
}
