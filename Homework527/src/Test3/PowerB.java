package Test3;

public interface PowerB {

	public void connect() ;
}

class PowerBImp1 implements PowerB{

	@Override
	public void connect() {
		System.out.println("电源B连接！");
	}
	
}