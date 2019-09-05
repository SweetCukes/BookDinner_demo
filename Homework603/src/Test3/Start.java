package Test3;

public class Start {

	public void Program() {
		Computer computer = new Computer();
		
		IMobileStorage mp3 = new Mp3Storage();
		
		IMobileStorage flashdisk = new FlashDisk();
		
		IMobileStorage mobiledisk = new MobileDisk();
		
		System.out.println("mp3接口接入：");
		computer.set_usbDrive(mp3);
		computer.WriteData();
		
		System.out.println("u盘接入：");
		computer.set_usbDrive(flashdisk);
		computer.WriteData();
		
		System.out.println("移动硬盘接入：");
		computer.set_usbDrive(mobiledisk);
		computer.WriteData();
	}
	public static void main(String[] args) {
		Start start = new Start()	;
		start.Program();
	}
	
	
}
