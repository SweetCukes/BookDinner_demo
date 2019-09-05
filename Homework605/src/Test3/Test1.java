package Test3;

import java.util.*;
import java.util.ArrayList;

public class Test1 implements Runnable {

	private int frontnum = 0;
	private int backnum = 0;
	private int person = 100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (this) {
				try {
					Thread.sleep(10);
					String threadName = Thread.currentThread().getName();
					if (person<0) {
						return;
					}
					else if (person>0) {
						if ("前门".equals(threadName)) {
							System.out.println("编号为："+(100-person +1)+
									"的员工从前场拿到的号码是："+this.show());
							frontnum++;
						}
						if ("后门".equals(threadName)) {
							System.out.println("编号为："+(100-person +1)+
									"的员工从后场拿到的号码是："+this.show());
							backnum++;
						}
						person--;
					}
					if (person == 0) {
						System.out.println("前门人数：" +frontnum);
						System.out.println("后门人数：" +backnum);
						person -- ;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public List<Integer> show() {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		int num = r.nextInt(33)+1;
		list.add(num);
		return list;
	}

}
