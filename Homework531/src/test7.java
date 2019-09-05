import java.util.Random; 
public class test7 {
public static void main(String[] args)
{ 
	Random r = new Random(); 
		for (int i = 1; i < 4; i++) {
			System.out.println("第" + i + "次:" +r.nextInt());
		}
//		随机数的种子一样，那么得到的结果也差不多。
//		解决方案：去掉1000。
	} 
}