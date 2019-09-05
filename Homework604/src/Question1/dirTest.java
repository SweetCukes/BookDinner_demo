package Question1;

import java.io.File;
import java.text.SimpleDateFormat;

public class dirTest {

	public static void main(String[] args) {
		SimpleDateFormat sdforFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		if (args.length >= 2) {
			String commNameString = args[0];
			String path = args[1];
			File file = new File(path); //定位目录
			String[] list  = file.list();
			for (int i = 0; i < list.length; i++) {
				file = new File(list[i]);
				String dir = "";
				if (file.isDirectory()) {
				dir = "<DIR>";
				}
				String fname = file.getName();
		
			long time = file.lastModified();
			if (file.isFile()) {	
				long fsize = file.length();
			
				long len = file.length();
			System.out.println(sdforFormat.format(time)+ "" + dir +"" + fname);
			
		}else {
			System.out.println(sdforFormat.format(time)+ " "+dir +""+ fname);
		}			
			}
	
	}else {
		System.out.println("请输入控制台参数");
	}
}
}
