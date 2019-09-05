package homework516;

import java.util.Arrays;

public class Test4 {
	public static void main(String[] args) {
		for (int i = 10; i <= 99; i++) {
		for (int j = i + 1; j <= 99; j++) {// 计算出所有两位数的积
		int sum = i * j;
		if (sum <= 9999 && sum >= 1000) {
			String[] t1 = (sum + "").split("");

			Arrays.sort(t1);

			String[] t2 = ("" + i + j).split("");

			Arrays.sort(t2);
					if (Arrays.equals(t1, t2)) {
						System.out.println(i + "*" + j + "=" + i * j);
					}
				}
			}
		}
	}
}