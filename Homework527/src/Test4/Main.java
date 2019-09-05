package Test4;

public class Main {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command cmd = new CommandImpl(receiver);
		
		Invoker invoker = new Invoker(cmd);
		invoker.action();
	}
}
