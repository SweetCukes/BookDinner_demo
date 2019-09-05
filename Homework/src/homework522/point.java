package homework522;
 class point {
	private int A;
	private int B;
	private int C;
	public point (int x,int y,int z) {
		A = x;
		B = y;
		C = z;
	}
	
	public void setA(int x) {
		A = x;
	}
	
	public void setB(int y) {
		B = y;
	}
	
	public void setC(int z) {
		C = z;
	}
	
	public void dian() {
		System.out.println(""+A+","+B+","+C);
	}
	
	public double distance(int A,int B,int C) {
		return A*A+B*B+C*C;
	}
	
	
}
