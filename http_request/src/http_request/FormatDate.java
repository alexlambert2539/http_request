package http_request;

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class FormatDate {

	public String format(Date date) {
		
		DateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.ENGLISH);
		dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		String formattedDate = dateFormat.format(date);	
		
		return formattedDate;
		
	}
	
}
