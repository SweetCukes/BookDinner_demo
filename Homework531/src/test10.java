
public class test10 {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("hello");
		if( ((s.length()>5)) && (s.append("there").equals("false")));
		System.out.println("value is "+ s);
	}
}
