package Test2;

public class Test1 implements Runnable{

	int i = 1;
	public void run() {
		synchronized (this) {
			while (true) {
				notify();
			 
			 if (i <= 1000) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
				e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+":"+i);
				i++;
			}else {
				break;
			}
			 try {
				 wait();
				 Thread.sleep(10);
			 }catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		}
	}
}
