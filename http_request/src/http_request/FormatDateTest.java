package http_request;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class FormatDateTest {
	
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
	private String dateString = "31-12-9999";
	
	@Test
	public void test() throws ParseException {
		
		Date date = simpleDateFormat.parse(dateString);
		
		FormatDate formatDate = new FormatDate();
		
		assertEquals(formatDate.format(date), "Fri, 31 Dec 9999 00:00:00 GMT");
		
		System.out.println("original date: " + date);
		System.out.println("formatted date: " + formatDate.format(date));
		
	}

}
