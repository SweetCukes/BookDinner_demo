import java.util.Scanner;

public class Test3
{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			String s = scanner.nextLine();
			String news = s;
			
		if (news.contains("P")&&news.contains("A")&&news.contains("T")) {
			news = news.replace("A", "");
			news = news.replace("P", "");
			news = news.replace("T", "");
			news = news.replace("\\s+", "");
			if (news.isEmpty()) {
				int p = s.indexOf("P");
				int t = s.indexOf("T");
			}
		}
		}
	}
}
