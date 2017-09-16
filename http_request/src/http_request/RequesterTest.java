package http_request;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URL;
import java.util.Date;

import org.junit.Test;

public class RequesterTest {
	
	private String urlStringName = "https://www.bbc.co.uk/iplayer";

	@Test
	public void test() throws IOException {
		Requester requester = new Requester();
		requester.getRequest(urlStringName);
		URL url = requester.getUrl();
		int statusCode = requester.getStatusCode();
		int contentLength = requester.getContentLength();
		Date date = requester.getDate();
		
		assertNotNull(url);
		assertNotNull(statusCode);
		assertNotNull(contentLength);
		assertNotNull(date);
		
		System.out.println(url);
		System.out.println(statusCode);
		System.out.println(contentLength);
		System.out.println(date);

	}

}
