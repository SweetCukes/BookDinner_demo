import javax.management.RuntimeErrorException;

public class test15 extends Throw{

	void myThow() {
		try {
			myThow_1(7,0);
		} catch (ArithmeticException e) {
			System.out.println();
		}
//		throw new RuntimeException("运行时异常");
		}
	public static void main(String[] args) {
		new test15().myThow();
	}
}

class Throw{
	void myThow() throws ArithmeticException, InterruptedException{
		myThow_1(3,6);
	}
	int myThow_1(int x,int y)throws ArithmeticException{
		return x/y;
	}
}
//			父类重写方法可以指定所有的已检查异常或者指定已检查异常的一部分
//			已检查异常是重载方法在其throws子句中声明的。
//			子类重写该方法不需要指定重写方法throws子句的任何已检查异常。
