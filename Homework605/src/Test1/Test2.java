package Test1;

public class Test2 implements Runnable {
	private String name ; 
	private int time ; 
	public Test2(String name,int time) {
		this.name = name;
		this.time = time;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(this.time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.name+"线程，休眠"+this.time+"毫秒");
	}
}
