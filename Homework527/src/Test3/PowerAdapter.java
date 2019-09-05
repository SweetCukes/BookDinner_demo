package Test3;

class PowerAdapter implements PowerA {
	private PowerB powerB;
	
	public PowerAdapter(PowerB powerB) {
		this.powerB = powerB;
	}
	public void insert() {
		powerB.connect();
	}
	
}
