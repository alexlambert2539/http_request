package http_request;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

public class Request {
		
	public RequestProperties getRequest(String urlString) throws IOException {
		
		ValidateURL validateURL = new ValidateURL();
		FormatDate formatDate = new FormatDate();
		
		RequestProperties requestProperties = new RequestProperties();
		
		if (validateURL.validate(urlString)) {
		
			String protocol = validateURL.determineProtocol(urlString);
			
			if (protocol.equals("http")) {
					
				String urlHttp = urlString;
				URL url = new URL(urlHttp);
				HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
				httpUrlConnection.setRequestMethod("GET");
				httpUrlConnection.setConnectTimeout(10000);
				httpUrlConnection.connect();
				
				requestProperties.url = httpUrlConnection.getURL().toString();
				requestProperties.statusCode = String.valueOf(httpUrlConnection.getResponseCode());
				requestProperties.contentLength = String.valueOf(httpUrlConnection.getContentLength());
				requestProperties.date = formatDate.format(new Date(httpUrlConnection.getDate()));
								
			} else if (protocol.equals("https")) {
				
				String urlHttps = urlString;
				URL url = new URL(urlHttps);
				HttpsURLConnection httpsUrlConnection = (HttpsURLConnection) url.openConnection();
				httpsUrlConnection.setRequestMethod("GET");
				httpsUrlConnection.setConnectTimeout(10000);
				httpsUrlConnection.connect();
				
				requestProperties.url = httpsUrlConnection.getURL().toString();
				requestProperties.statusCode = String.valueOf(httpsUrlConnection.getResponseCode());
				requestProperties.contentLength = String.valueOf(httpsUrlConnection.getContentLength());
				requestProperties.date = formatDate.format(new Date(httpsUrlConnection.getDate()));
								
			} else {
					
				System.err.println("invalid URL: " + urlString);
					
			}
		
		} else {
			
			requestProperties.url = urlString;
			requestProperties.error = "invalid url";
			
		}
		
		return requestProperties;
				
	}
	
}
