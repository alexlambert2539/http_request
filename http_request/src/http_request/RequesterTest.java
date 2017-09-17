package http_request;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

public class RequesterTest {
	
	private String[] urlStringName = {"http://www.bbc.co.uk/iplayer", 
	                                  "https://google.com", 
	                                  //"bad://address", 
	                                  "http://www.bbc.co.uk/missing/thing", 
	                                  "http://not.exists.bbc.co.uk/", 
	                                  "http://www.oracle.com/technetwork/java/javase/downloads/index.html", 
	                                  "https://www.pets4homes.co.uk/images/articles/1646/large/kitten-emergencies-signs-to-look-out-for-537479947ec1c.jpg", 
	                                  "http://site.mockito.org/"};
	
	@Test
	public void test() throws IOException {
		
		Requester requester = new Requester();
		
		for (int i=0; i<urlStringName.length; i++) {
			
			RequestProperties requestProperties = requester.getRequest(urlStringName[i]);		
			
			assertEquals(requestProperties.url, urlStringName[i]);
			
			System.out.println(requestProperties.url);
			System.out.println(requestProperties.statusCode);
			System.out.println(requestProperties.contentLength);
			System.out.println(requestProperties.date);
			
		}
		
	}

}
