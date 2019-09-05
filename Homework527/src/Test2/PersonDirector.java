package Test2;

public class PersonDirector {

	public Person constructPerson(Personbuilder pb) {
		pb.buildBody();
		pb.buildFoot();
		pb.buildHead();
		return pb.ManBuilder();
	}
}
