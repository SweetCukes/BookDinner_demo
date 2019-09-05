
public class test14 {

	public static void main(String[] args) {
		someMethod(1);
	}

	public static void someMethod(int i) {
		System.out.println("int版本被调用");
		
	}
	public static void someMethod(Integer i ) {
		System.out.println("integer版本被调用");
	}
	
//	结果显示：int版本被调用，如果想要调用integer版本，需要指定someMethod(new integer(1))
	
}
