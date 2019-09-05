package Test7;

public class Test7 {
	public static void main(String[] args) {
		System.out.println(findResult());
	}
	//最终以finally为准

	@SuppressWarnings("finally")
	private static boolean findResult() {
		try {
			return true;
		} catch (Exception e) {
			return true;
		}finally {
			return false;
		}
	}
}
