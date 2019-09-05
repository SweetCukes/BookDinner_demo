import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int x = i*j;
		while (x != 0 ) {
			int b = x % 10;
			x = x/10;
			System.out.print(b); 
		}
	}
}
