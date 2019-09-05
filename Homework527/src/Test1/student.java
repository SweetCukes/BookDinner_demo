package Test1;

public class student extends List{

	public student(String name, String classes, String date, String cause) {
		super(name, classes, date, cause);
		this.name = name;
		this.cause = cause;
		this.classes = classes;
		this.date = date;
	}

	public String getCount() {
		return 
				" 姓名：" + super.getName()+
				" 班级："+super.getClasses()+
				" 时间："+super.getDate()+
				" 请假理由："+super.getCause();
	}

}
