import java.util.Scanner;

public class Test2 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String k = sc.next();
		int[] a=new int[k.length()];
		int num = 0;
		for (int i = 0; i < k.length(); i++) {
			a[i] = Integer.parseInt(k.substring(i,i+1));
			num = num+a[i];
		}
		
		String numtoString = String.valueOf(num);
		String sum = "";
		for (int i = 0; i < numtoString.length(); i++) {
			String x = null;
			switch (Integer.parseInt(numtoString.substring(i,i+1))) {
			case 0: x="ling";break;
			case 1: x="yi";break;
			case 2: x="er";break;
			case 3: x="san";break;
			case 4: x="si";break;
			case 5: x="wu";break;
			case 6: x="liu";break;
			case 7: x="qi";break;
			case 8: x="ba";break;
			case 9: x="jiu";break;
			default:
				System.out.println("输入错误");
				break;
			}
			sum = sum+" "+x;
		}
		System.out.println(sum.trim());
	}
}
