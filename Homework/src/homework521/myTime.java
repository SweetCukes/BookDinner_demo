package homework521;

public class myTime {
	private int hour;
	private int minute;
	private int second;
	public myTime(int hour,int minute,int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void diaplay(myTime time) {
		System.out.println(this.getHour()+":"+this.getMinute()+":"+this.getSecond());
	}

	
	
	private int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	private int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	private int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}
	
	public void addSecond(int sec){
		this.second = second + sec;
	}
		
	public void addMinute(int min){
		this.minute = minute + min;
	}
		
	public void addHour(int hou){
		this.hour = hour + hou;
	}
	
	public void subSecond(int sec){
		this.second = second - sec;
	}
		
	public void subMinute(int min){
		this.minute = minute - min;
	}
	
	public void subHour(int hou){
		this.hour = hour - hou;
	}
	
	public static void main(String[] args) {
		myTime time = new myTime(10	, 56, 16);
		time.diaplay(time);
		time.addHour(2);
		time.addMinute(2);
		time.addSecond(2);
		time.diaplay(time);
	}
}
