import java.util.Arrays;
import java.util.List;

enum Week{
	Sun,Mon,Tue,Wed,Thu,Fri,Sat
}
public class test2 {
	public static void main(String[] args) {
		Week[]workDays = {
				Week.Mon,Week.Tue,Week.
		Wed,Week.Thu,Week.Fri	};
		
	List<Week>list = Arrays.asList(workDays);
//	aslist()new了一个java.util.Arrays.Arrays.list
//	他不能直接输入List没有实现抽象类的add方法。
	list.add(Week.Sat);
	}
}
