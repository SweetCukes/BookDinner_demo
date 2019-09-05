package Test12;

class Point{
	protected final int x,y;
	private final String name;
	Point(int x,int y){
		this.x = x;
		this.y = y;
		name = makeName();
	}
	protected String makeName() {
		return "[" +x+","+"y"+"]";
	}
	public final String tostString() {
		return name;
	}
}
public class Test12 extends Point{
	protected final String color;
	Test12(int x, int y,String color) {
		super(x, y);
		this.color = color;
	}
	protected String makeName() {
		return super.makeName()+":"+color;
	}
	public static void main(String[] args) {
		 System.out.println(new Test12(4, 2, "blue"));
	}
	//在构造方法中调用了可复写的方法。
}
