package Test3;

public class Main {

	public static void main(String[] args) {
		PowerA powerA = new PowerAImp1();
		start(powerA);
		PowerB powerB = new PowerBImp1();
		PowerAdapter pa = new PowerAdapter(	powerB	);
		start((PowerA) pa);
	}

	private static void start(PowerA powerA) {
		System.out.println("asdf//");
		powerA.insert();
		System.out.println("asdf\\");
		
	}
	
	private static void start(PowerB powerB) {
		System.out.println("asdf\\");
		powerB.connect();
		System.out.println("asdf//");
	}
}
