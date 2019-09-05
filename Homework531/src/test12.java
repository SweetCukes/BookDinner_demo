
public class test12 {

	public static void changeStr(String str) {
		str  = "welcome";
	}
//	java传递的是拷贝，进changestr时，传递一份str的拷贝进去。
//	字符串是不可变的
	public static void main(String[] args) {
		String str = "1234";
		changeStr(str);
		System.out.println(str);
	}
}
