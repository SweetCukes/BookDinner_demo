package Test3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo implements MyDateTime {
	private Calendar calendar;
	public CalendarDemo() {
		this.calendar = new GregorianCalendar();
	}
	@Override
	public String getDate() {
		StringBuffer buf = new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR)).append("-");
		buf.append(this.addZero((calendar.get(Calendar.MONTH) + 1), 2)).append("-");
		buf.append(this.addZero(calendar.get(Calendar.DATE), 2));
		return buf.toString();
	}
	@Override
	public String getDateTime() {
		StringBuffer buf = new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR)).append("-");
		buf.append(this.addZero((calendar.get(Calendar.MONTH) + 1), 2)).append("-");
		buf.append(this.addZero(calendar.get(Calendar.DATE), 2)).append(" ");
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2)).append(":") ;
		buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2)).append(":") ;
		buf.append(this.addZero(calendar.get(Calendar.SECOND), 2)).append(".") ;
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3)) ;
		return buf.toString();
	}
	@Override
	public String getTimeStamp() {
		StringBuffer buf = new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR));
		buf.append(this.addZero((calendar.get(Calendar.MONTH) + 1), 2));
		buf.append(this.addZero(calendar.get(Calendar.DATE), 2));
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2));
		buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2)) ;
		buf.append(this.addZero(calendar.get(Calendar.SECOND), 2)) ;
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3)) ;
		return buf.toString();
	}
	private String addZero(int num, int len) {
		StringBuffer buf = new StringBuffer();
		buf.append(num);
		while (buf.length() < len) {
			buf.insert(0, 0);
		}
		return buf.toString();
	}
}
