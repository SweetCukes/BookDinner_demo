package homework522;

public class TriAngelTest {
	
	public static void main(String[] args) {
		
	TriAngle triAngle = new TriAngle()	;
	triAngle.setBase(3);
	triAngle.setHeight(6);
	System.out.println("三角形的面积是："+triAngle.area());
	}
}