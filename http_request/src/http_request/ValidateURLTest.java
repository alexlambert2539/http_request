package http_request;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateURLTest {
	
	private String httpUrl = "http://www.bbc.co.uk/iplayer";
	private String httpsUrl = "https://google.com";
	private String badUrl = "bad://address";

	@Test
	public void test() {
		
		ValidateURL validateURL = new ValidateURL();
		
		assertTrue(validateURL.validate(httpUrl));
		assertTrue(validateURL.validate(httpsUrl));
		assertFalse(validateURL.validate(badUrl));
		
	}

}
