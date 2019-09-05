package Test1;

abstract class List {
	String name;
	String classes;
	String date;
	String cause;
	public List(String name,String classes,String date,String cause) {
		this.name=name;
		this.classes=classes;
		this.date=date;
		this.cause=cause;
	}
	public String getName() {
		return name;
	}
	public String getClasses() {
		return classes;
	}
	public String getDate() {
		return date;
	}
	public String getCause() {
		return cause;
	}
	
	public  void show() {
		System.out.println(this.getCount());
	}
	public abstract String getCount();
}
