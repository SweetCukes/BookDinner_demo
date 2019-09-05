package homework515;

import java.util.InputMismatchException;
import java.util.Scanner;

public class stuAverage {

	public static void main(String[] args) {
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i < 10; i++) {
			System.out.println("请输入第"+i+"位学生的成绩");
				while(true) {
			try {
			sum += sc.nextDouble();
			}
			catch (InputMismatchException e) {
			System.out.println("请输入正确的分数");
			sc.next();
			i--;
			}	
				
				break;
				}
		}
		System.out.println("总分为："+sum);
		System.out.println("平均成绩为："+sum/10);
		}
	}
			

	