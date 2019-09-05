package Test1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StaffListReader {

	public  void read() {
		StaffListReader t = new StaffListReader()	;
		String filepath = "/Users/ashikotakeshi/eclipse-workspace/Homework606/src/Test1/StaffList";
		String input = t.readfile(filepath);
		System.out.println(input);
	}

	private String readfile(String filepath)  {
		FileInputStream input = null;
		String result = "";
		try {
			input = new FileInputStream(filepath);
			int size = input.available();
			byte[] array  = new byte[size];
			input.read(array	);
			result = new String(array);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	return result;
	
	}
}	
