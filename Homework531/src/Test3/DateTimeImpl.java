package Test3;

import java.text.SimpleDateFormat;

public class DateTimeImpl implements MyDateTime {
	
	private SimpleDateFormat sdf;
    
    @Override
    public String getDateTime() {
        String str = null;
        this.sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        str = this.sdf.format(new java.util.Date());
        return str;
    }
    
    @Override
    public String getTimeStamp() {
        String str = null;
        this.sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        str = this.sdf.format(new java.util.Date());
        return str;
    } 
    
    public String getDate() {
        String str = null;
        this.sdf = new SimpleDateFormat("yyyy-MM-dd");
        str = this.sdf.format(new java.util.Date());
        return str;
    }
}
