
public class Test13 {
public static void main(String[] args) {
	String s1 = new String("xyz");
	String s2 = new String("xyz");
	Boolean boolean1 = s1.equals(s2);
	Boolean boolean2 = (s1==s2);
	System.out.println(boolean1+""+boolean2);
}
}
