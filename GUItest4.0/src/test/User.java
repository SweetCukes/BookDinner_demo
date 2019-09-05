package test;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class User  {

	public String name="匿名";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int score;
	public int punches(GameUI gameUI, JButton cqbtn) {
		int perFirst = 0;
		if (cqbtn == gameUI.jlb) {
			perFirst = 1;
			gameUI.p1lb.setIcon(new ImageIcon("src/test/j.png"));
		}else if (cqbtn == gameUI.stlb) {
			perFirst = 2;
			gameUI.p1lb.setIcon(new ImageIcon("src/test/q.png"));
		}else if(cqbtn == gameUI.blb){
			perFirst = 3;
			gameUI.p1lb.setIcon(new ImageIcon("src/test/b.png"));
		}
		return perFirst;
	}
}
