package http_request;

import java.io.IOException;
import java.net.URL;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

public class Requester {
	
	private URL urlString;
	private int statusCode;
	private int contentLength;
	private Date date;
	
	public void getRequest(String urlStringName) throws IOException {
		
		String urlHttps = urlStringName;
		URL urlName = new URL(urlHttps);
		HttpsURLConnection httpsUrlConnection = (HttpsURLConnection) urlName.openConnection();
		httpsUrlConnection.setRequestMethod("GET");
		httpsUrlConnection.connect();
		
		urlString = httpsUrlConnection.getURL();
		statusCode = httpsUrlConnection.getResponseCode();
		contentLength = httpsUrlConnection.getContentLength();
		date = new Date(httpsUrlConnection.getDate());
				
	}
	
	public URL getUrl() {
		
		return urlString;
		
	}
	
	public int getStatusCode() {
		
		return statusCode;
		
	}

	public int getContentLength() {
	
		return contentLength;
	
	}

	public Date getDate() {
	
		return date;
	
	}
	
}
