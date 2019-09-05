package test;


public class Computer{
	public String name;
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
	public int computeShowFirst() {
		int show = (int )(Math.random()*10)%3+1;
		switch (show) {
		case 1:
		
			break;
		case 2:
			break;
		case 3:
			
			break;
		}
		return show;
	}
	
}
