package Test4;

public class CommandImpl implements Command{
	private Receiver receiver;
	public CommandImpl(Receiver receiver) {
		this.receiver=receiver;
	}
	public void execute() {
		receiver.action();
	}
}
