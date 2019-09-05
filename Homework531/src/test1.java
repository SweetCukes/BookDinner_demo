
public class test1 {

	public static void main(String[] args) {
		char x = 'X';
		int i = 0;
		System.out.println(true ? x : 0);
		System.out.println(true ? x : 65536);
		System.out.println(true ? x : i);
		System.out.println(false ? 0 : x);
		System.out.println(false ? i : x);
	}
}
