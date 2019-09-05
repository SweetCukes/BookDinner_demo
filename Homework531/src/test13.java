import java.util.Arrays;
public class test13 {

	public static void main(String[] args) {
		printArgs(1,2,3,4,5);
	}

	private static void printArgs(Object... args) {
		System.out.println(Arrays.toString(args));
		
	}
	
//	使用普通的导入声明代替静态导入
//	静态导入的tostring方法恰好被object方法中继承而来的同名方法遮蔽
}
