package Test4;

import java.io.File;

public class Test4 {
	public static void main(String[] args) {
		String path = "d:/home/nginx/file";
		new File(path).mkdir();
		new File(path).mkdirs();
		//mkdirs会建立多级目录，而mkdir只会建立一层目录
	}
}
