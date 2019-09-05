
public class Test11 {
	public static void main(String[] args) {
		int score[] = null;
		score = new int[5];
		for (int i = 0; i < score.length; i++) {
			score[i]  = i*3;
		}
		for (int i = 0; i <3; i++) {
			System.out.println("score["+i+"]=" +score[i]);
		}
		
	}
}
