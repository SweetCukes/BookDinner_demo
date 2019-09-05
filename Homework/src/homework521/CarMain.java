package homework521;

import java.util.Scanner;

public class CarMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Car car = new Car()	;
		System.out.println("请输入颜色");
		Scanner input = new Scanner(System.in);
		car.color = input.next();
		System.out.println("请输入型号");
		Scanner input1 = new Scanner(System.in);
		car.name=input1.next();
		car.run();
	}
}
