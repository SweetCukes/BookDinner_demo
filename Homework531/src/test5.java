import java.io.Serializable;

public class test5 {
public static void main(String[] args) {
	Object hello="hello";
		System.out.println(">>1:"+(hello instanceof Object)); 
		System.out.println(">>2:"+(hello instanceof String));
//		instanceof运算符，判断对象是否是对边的实例，返回true|false。
//		不能强转math。
//		Math math =(Math)hello;
//		hello是比较器接口的一个类。
//		空对象没有任何意义。
//		System.out.println(">>3:"+(math instanceof Math)); 
		System.out.println(">>4:"+(hello instanceof Comparable));
		System.out.println(">>4:"+(null instanceof Object)); 
		System.out.println(">>5:"+(hello instanceof Serializable));
	}
}
  
