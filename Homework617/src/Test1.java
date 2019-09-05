import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
	List<student> list = Arrays.asList(
			new student("1", 12),new student("", 88)	
);
	
	Map<Integer, List<String>> rst = new HashMap<>();
	for(student stu : list) {
		if (stu.score() >= 80) {
			
		}
	}
}
	class student{
		String name;
		int score;
		public student(String name,int score) {
			super();
			this.name = name;
			this.score = score;
		}
	}
	
	