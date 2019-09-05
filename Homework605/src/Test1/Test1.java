package Test1;

public class Test1 extends Thread {
	private int time;
	public Test1 (String name , int time) {
		super(name);
		this.time = time;
	}
	public void run() {
		try {
			Thread.sleep(this.time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"线程，休眠"+this.time+"毫秒");
	}
}
