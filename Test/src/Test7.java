
public class Test7 {
 public static void main(String[] args) {
	 
	
}
 public static int val() {
	int num = 5;
	try {
		num = num/0;
	} catch (Exception e) {
		num = 10;
	}finally {
	      num = 15;
	         
}
	return num;
}
}
