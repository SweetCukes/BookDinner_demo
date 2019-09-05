package homework522;

class TriAngle {

	private double base;
	private double height;
	public void TriAngel(double base,double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	public void setBase(double base) {
		this.base =base;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double  area() {
		return this.base*this.height/2;
		
	}
}