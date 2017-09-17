package http_request;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URL;
import org.junit.Test;

public class RequesterTest {
	
	private String[] urlStringName = {"https://www.bbc.co.uk/iplayer", 
	                                  "https://google.com", 
	                                  //"bad://address", 
	                                  "http://www.bbc.co.uk/missing/thing", 
	                                  "http://not.exists.bbc.co.uk/", 
	                                  "http://www.oracle.com/technetwork/java/javase/downloads/index.html", 
	                                  "https://www.pets4homes.co.uk/images/articles/1646/large/kitten-emergencies-signs-to-look-out-for-537479947ec1c.jpg", 
	                                  "http://site.mockito.org/"};

	@Test
	public void test() throws IOException {
		
		for (int i=0; i<urlStringName.length; i++) {
			
			Requester requester = new Requester();
			requester.getRequest(urlStringName[i]);
			URL url = requester.getUrl();
			int statusCode = requester.getStatusCode();
			int contentLength = requester.getContentLength();
			String date = requester.getDate();
			
			assertEquals(url, new URL(urlStringName[i]));
			assertNotNull(statusCode);
			assertNotNull(contentLength);
			assertNotNull(date);
			
			System.out.println(url);
			System.out.println(statusCode);
			System.out.println(contentLength);
			System.out.println(date);
			
		}
		
	}

}
