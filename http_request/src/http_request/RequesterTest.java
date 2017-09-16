package http_request;

import static org.junit.Assert.*;

import org.junit.Test;

public class RequesterTest {

	@Test
	public void test() {
		Requester requester = new Requester();
		requester.getRequest();
		String url = requester.getUrl();
		String statusCode = requester.getStatusCode();
		String contentLength = requester.getContentLength();
		String date = requester.getDate();
		
		assertNotNull(url);
		assertNotNull(statusCode);
		assertNotNull(contentLength);
		assertNotNull(date);

	}

}
