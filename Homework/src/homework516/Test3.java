package homework516;

public class Test3 {
	public static void main(String[] args) {
		int x,y,z;
		for (int i = 100; i < 999; i++) {
			x = i/100;
			y = (i/10)%10;
			z = i%10;
			if (i == (x*x*x+y*y*y+z*z*z)) {
				System.out.println(i);
			}
		}
	}
}
