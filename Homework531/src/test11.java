class Dog{
		public static void bark(){
		System.out.print("woof "); 
		} 
	}
		class Basenji extends Dog{
			public static void bark(){}
		} 
//		因为bark是一个静态方法，静态方法的调用不存在任何动态的调用机会
//		静态方法没有重写的概念，所以依然会被调用woof。
public class test11 {
	public static void main(String[] args) {
		Dog woofer = new Dog(); 
		Dog nipper = new Basenji(); woofer.bark(); nipper.bark();
}
}
		