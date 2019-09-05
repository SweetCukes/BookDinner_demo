package Test14;

import java.math.BigInteger;

public class Test14 {
	public static void main(String[] args) {
		BigInteger fiveThousand = new BigInteger("5000");
		BigInteger fiftyThousand = new BigInteger("50000");
		BigInteger fiveHundredThousand = new BigInteger("500000");
		BigInteger total = BigInteger.ZERO;
		total.add(fiveThousand);
		total.add(fiftyThousand);
		total.add(fiveHundredThousand);
		System.out.println(total);
		//biginteger实例是不可变的，所以打印total是0
	}
}
