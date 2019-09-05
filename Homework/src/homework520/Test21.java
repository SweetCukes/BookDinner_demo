package homework520;

import java.util.Scanner;

public class Test21 {
	public static void main(String[] args) {
		System.out.println("请输入原运费：");
		Scanner x = new Scanner(System.in);
		double cash;
		cash=x.nextInt()	;
		System.out.println("请输入货物历程：");
		double dist;
		Scanner a = new Scanner(System.in);
		dist=a.nextInt();
		int k=0;
		k = (int) (cash%500);
		switch (k) {
		case 0:
			System.out.println("没有任何优惠！");
			System.out.println("运费为："+cash);
			break;
		case 1:
			System.out.println("优惠5%运费");
			System.out.println("运费为："+0.95*cash);
			break;
		case 2:
			System.out.println("优惠8%运费");
			System.out.println("运费为："+0.92*cash);
			break;
		case 3:
		case 4:
			System.out.println("优惠10%运费");
			System.out.println("运费为："+0.9*cash);
			break;
		default:
			System.out.println("优惠12%运费");
			System.out.println("运费为："+0.88*cash);
			break;
		}
	}
}
