package http_request;

import org.junit.Test;

public class JsonFormatTest {

	@Test
	public void test() {
		
		RequestProperties requestProperties = new RequestProperties();
		requestProperties.url = "http://www.google.com";
		requestProperties.statusCode = String.valueOf(200);
		requestProperties.contentLength = String.valueOf(20000);
		requestProperties.date = "Tue, 25 Jul 2017 17:00:55 GMT";
		requestProperties.error = "invalid url";
		
		JsonFormat jsonFormat = new JsonFormat();
		
		System.out.println("JSON formatted:\n" + jsonFormat.toJson(requestProperties));
		
	}

}
