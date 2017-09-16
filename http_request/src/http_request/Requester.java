package http_request;

public class Requester {
	
	private String urlString;
	private String statusCode;
	private String contentLength;
	private String date;
	
	public void getRequest() {
		
		
		
		
		
		setUrl(null);
		setStatusCode(null);
		setContentLength(null);
		setDate(null);
		
	}
	
	private void setUrl(String string) {
		
		urlString = string;
		
	}
	
	private void setStatusCode(String string) {
		
		statusCode = string;
		
	}

	private void setContentLength(String string) {
	
		contentLength = string;
	
	}

	private void setDate(String string) {
	
		date = string;
	
	}

	public String getUrl() {
		
		return urlString;
		
	}
	
	public String getStatusCode() {
		
		return statusCode;
		
	}

	public String getContentLength() {
	
		return contentLength;
	
	}

	public String getDate() {
	
		return date;
	
	}
	
}
