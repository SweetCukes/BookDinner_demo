package homework520;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		Integer[] arr1 = {2 , 4 , 6 , 8 , 10};
		arraycopy(arr1,0,arr1,1,4);
		System.out.println(Arrays.toString(arr1));
		Integer[] arr2 = {3 , 6 , 9 , 12 , 15};
		Integer[] arr3 = {1 , 3 , 5 , 7 , 10};
		arraycopy(arr2, 1, arr3, 2, 3);
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

	private static void arraycopy(Integer[] arr1, int i, Integer[] arr12, int j, int k) {
		// TODO Auto-generated method stub
		
	}
}
