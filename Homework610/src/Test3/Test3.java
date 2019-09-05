package Test3;

import java.util.ArrayList;
import java.util.Random;

public class Test3 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			list1.add(r.nextInt(25)*2);
		}
		System.out.println(list1);
	}
	
}
