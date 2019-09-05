package homework523;

import java.util.Scanner;

public class Test5232 {
		public static void main(String[ ] args) {
			person per = new person();
			per.setName();
		}
		

	
}	

class person {
	String name ;
	int num;
	
	public void setName() {
		person per = new person();
		@SuppressWarnings("resource")
		Scanner length = new Scanner(System.in);
		per.num=length.nextInt();
		for (int i = 0; i < per.num; i++) {
			System.out.println("名字"+i);
		}
	}
}
