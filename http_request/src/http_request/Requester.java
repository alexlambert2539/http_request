package http_request;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.net.ssl.HttpsURLConnection;

public class Requester {
	
	private URL urlString;
	private int statusCode;
	private int contentLength;
	private String date;
	
	public void getRequest(String urlStringName) throws IOException {
		
		String urlHttps = urlStringName;
		URL urlName = new URL(urlHttps);
		HttpsURLConnection httpsUrlConnection = (HttpsURLConnection) urlName.openConnection();
		httpsUrlConnection.setRequestMethod("GET");
		httpsUrlConnection.connect();
		
		urlString = httpsUrlConnection.getURL();
		statusCode = httpsUrlConnection.getResponseCode();
		contentLength = httpsUrlConnection.getContentLength();
		
		date = checkDateFormat(new Date(httpsUrlConnection.getDate()));
				
	}
	
	private String checkDateFormat(Date originalDate) {
		
		DateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.ENGLISH);
		dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		String formattedDate = dateFormat.format(originalDate);	
		
		return formattedDate;
		
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

	public String getDate() {
	
		return date;
	
	}
	
}
