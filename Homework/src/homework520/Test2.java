package homework520;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("请输入原运费：");
		Scanner x = new Scanner(System.in);
		double cash;
		cash=x.nextInt()	;
		System.out.println("请输入货物历程：");
		double dist;
		Scanner a = new Scanner(System.in);
		dist=a.nextInt();
		if (dist < 500) {
			System.out.println("没有任何优惠！");
			System.out.println("运费为："+cash);
		}else if(dist < 1000) {
			System.out.println("优惠5%运费");
			System.out.println("运费为："+0.95*cash);
		}else if(dist < 1500) {
			System.out.println("优惠8%运费");
			System.out.println("运费为："+0.92*cash);
		}else if(dist < 2500) {
			System.out.println("优惠10%运费");
			System.out.println("运费为："+0.9*cash);
		}else {
			System.out.println("优惠12%运费");
			System.out.println("运费为："+0.88*cash);
		}
	}
}
