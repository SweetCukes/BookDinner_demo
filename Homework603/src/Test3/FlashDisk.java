package Test3;

public class FlashDisk implements IMobileStorage {

	@Override
	public void write() {
		System.out.println("U盘开始写入。。。");
		System.out.println("U盘写入完毕！");
		
	}

	@Override
	public void read() {

		System.out.println("U盘开始读取。。。");
		System.out.println("U盘读取完毕！");
	}

}
