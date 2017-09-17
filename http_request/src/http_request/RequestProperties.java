package http_request;

public class RequestProperties {

	public String url;
	public String statusCode;
	public String contentLength;
	public String date;
	
	public String error;
	
	public void setUrl(String url) {
		
		this.url = url;
		
	}
	
	public void setStatusCode(String statusCode) {
		
		this.statusCode = statusCode;
		
	}

	public void setContentLength(String contentLength) {
	
		this.contentLength = contentLength;
	
	}

	public void setDate(String date) {
	
		this.date = date;
	
	}
	
	public String getUrl() {
		
		return url;
		
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
