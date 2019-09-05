package 	Test2;

interface timeMemory {
	public long timeComuse();
	public long memoryComuse();
}
class real implements timeMemory {
	public long timeComuse(){
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		long excTime = (endTime-startTime);
		System.out.println("程序花费时间！" + excTime + "ms");
		return excTime;
	}
	
	public long memoryComuse(){
		Runtime r = Runtime.getRuntime();    
		long freeMemory = r.freeMemory(); 
		long totalMemory = r.totalMemory(); 
		long usedMemory = totalMemory - freeMemory;
		System.out.println("程序占用内存：" + usedMemory + "KB");
		return usedMemory;
	}
}
class Proxy implements timeMemory {
	private timeMemory tm ;
	public Proxy(timeMemory tm) {
		this.tm = tm ;
	}
	
	
	
	@Override
	public long memoryComuse() {
		return this.tm.timeComuse();
	}
	@Override
	public long timeComuse() {
		return this.tm.memoryComuse();
	}
}


public class Test2 {
	public static void main(String[] args){
		timeMemory tm = null;
		Proxy proxy = new Proxy(tm);
		
	}
}
