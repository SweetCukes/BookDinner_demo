package Test13;

public class Test13 {
	static boolean foo(char c) {
		System.out.println(c);
		return true;
	}
	public static void main(String[] args) {
		int i = 0;
		for(foo('A');foo('B') && (i<2);foo('C')) {
			i++;
			foo('D');
		}
	//第一次循环：打印字母A，然后打印字母B，然后认定i<2进入循环，打印字母D。
	//然后打印字母C，打印字母B，i<1进入循环，然后打印D，C
	//第三次循环：打印D，退出循环
	}
}
