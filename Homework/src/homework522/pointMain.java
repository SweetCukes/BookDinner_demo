package homework522;

public class pointMain {
	public static void main(String[] args) {
		double o = 0;
		point point = new point(3, 3, 3);
		point.dian();
		o = point.distance(3, 3, 3);
		System.out.println("离原点距离的平方是："+o);
	}
}
