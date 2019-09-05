package Test3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) throws Exception{
        String oldDate = "1999-1-24 12:52:37.900";
        String newDate = null;
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒sss毫秒");
        Date date = sdf1.parse(oldDate); 
        newDate = sdf2.format(date); 
        System.out.println("格式化后日期：" + newDate);
    }
}
