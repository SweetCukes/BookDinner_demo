import java.util.Scanner;

public class Test1 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int i = 0;
			while(K!=1) {
				if (K%2==0) {
					K = K/2;
				}else {
					K = (3*K+1)/2;
				}
				i++;
			}
			System.out.println(i);
		}
	}
