package Test3;

import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		
	}
	public static <E> void read(List<? super E> list) {
		int sum = 0;
		for(Object obj : list) {
			
		}
	}
	public static void write(List<? extends Number> list) {
		list.add(123, null);
	}
}
