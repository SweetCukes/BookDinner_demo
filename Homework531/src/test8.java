import java.util.Scanner;

public class test8 {

	public final static int LIMIT = 2000;
	public static 	void main(String[] args) {
		int cur = 1000;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数量：");
		while (input.hasNextInt()) {
			int order = input.nextInt();
			if (order>0 && order + cur <= LIMIT) {
				System.out.println("你已经预定的" + order + "个产品！");
			}else {
				System.out.println("超过限额！预定失败！");
			}
//			易导致整数最大值溢出。
//		  不能等于整数最大值，如果一旦大于整数最大值应该抛异常提醒用户。
//			应做边界值判断。
		}
	}
}
