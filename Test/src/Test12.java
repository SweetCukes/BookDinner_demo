
public class Test12 extends vehicle {
	public static void main(String[] args) {
		Boolean flag = false;
		if (flag=true) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	private final void run() {
		char foo='中';
		System.out.println("car");
	}
}

class vehicle{
	private final void run()
	{
		System.out.println("Vehicle");
	}
}