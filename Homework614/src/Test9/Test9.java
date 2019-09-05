package Test9;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Test9 {
	private Date birthDate = new Date();
	public boolean isBabyBoomer() {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		cal.set(1946, Calendar.JANUARY,1,0,0,0);
		Date boomStart = cal.getTime();
		cal.set(1965, Calendar.JANUARY,1,0,0,0);
		Date boomEnd = cal.getTime();
		return birthDate.compareTo(boomStart) >= 0
		&& birthDate.compareTo(boomEnd)<0;
	}
}
