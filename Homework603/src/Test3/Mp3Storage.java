package Test3;

public class Mp3Storage implements IMobileStorage{

	@Override
	public void write() {

		System.out.println("Mp3开始写入。。。");
		System.out.println("Mp3写入完毕！");
		
	}

	@Override
	public void read() {
		System.out.println("Mp3开始读取。。。");
		System.out.println("Mp3读取完毕！");
	}
	
	public void PlayMusic(){
		System.out.println("音乐开始播放。。");
	}

}
