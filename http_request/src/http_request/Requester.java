package http_request;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
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
		
		String protocolType = determineProtocol(urlStringName);
		
		if (protocolType.equals("http")) {
			
			String urlHttp = urlStringName;
			URL urlName = new URL(urlHttp);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) urlName.openConnection();
			httpUrlConnection.setRequestMethod("GET");
			httpUrlConnection.connect();
			
			urlString = httpUrlConnection.getURL();
			statusCode = httpUrlConnection.getResponseCode();
			contentLength = httpUrlConnection.getContentLength();
			
			date = checkDateFormat(new Date(httpUrlConnection.getDate()));
			
		} else if (protocolType.equals("https")) {
			
			String urlHttps = urlStringName;
			URL urlName = new URL(urlHttps);
			HttpsURLConnection httpsUrlConnection = (HttpsURLConnection) urlName.openConnection();
			httpsUrlConnection.setRequestMethod("GET");
			httpsUrlConnection.connect();
			
			urlString = httpsUrlConnection.getURL();
			statusCode = httpsUrlConnection.getResponseCode();
			contentLength = httpsUrlConnection.getContentLength();
			
			date = checkDateFormat(new Date(httpsUrlConnection.getDate()));
			
		} else {
			
			System.err.println("protocol type is not http or https");
			
		}
				
	}
	
	private String determineProtocol(String urlStringName) throws MalformedURLException {
		
		URL urlName = new URL(urlStringName);
		String protocolString = urlName.getProtocol();
		
		return protocolString;
				
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
