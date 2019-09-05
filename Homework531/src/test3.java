
	public class test3 {
		public static void main(String[] args) {
			Integer one=128;
			Integer two=128;
			System.out.println(one == two);
//			整形包装类存在量池，一次性把-128到127所有树初始化了，
//			使用这些数时不是创建新对象而是直接从这个常量池里面取值，
//			赋值128时分别new对象，内存地址不同。
			Integer one2=100;
			Integer two2=100; 
			System.out.println(one2 == two2);
		}
		
}