package Test11;
interface inter{
	
}
class A{
	
}
class B extends A implements inter{
	
}
public class Test11 extends B{
	public static void main(String[] args) {
		A a =new A();
		B b = new B();
		Test11 c = new Test11();
		if (a instanceof B) {
			System.out.println("hello A");
		}
		if (b instanceof A) {
			System.out.println("Hello B");
		}
		if (c instanceof Test11) {
			System.out.println("hello C");
		}
		if (c instanceof inter) {
			System.out.println("hello 1");
		}
	}
}
