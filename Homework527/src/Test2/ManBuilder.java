package Test2;

public class ManBuilder implements Personbuilder{
	Person person;
	public ManBuilder() {	
		person = new Person();
	}
	@Override
	public void buildBody() {
		person.setBody("身体");
	}

	@Override
	public void buildFoot() {
		person.setFoot("脚");
	}

	@Override
	public void buildHead() {
		person.setHead("头");
	}
	@Override
	public Person ManBuilder(){
		return person;
	}

	

}
