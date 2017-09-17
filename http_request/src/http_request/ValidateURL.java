package http_request;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.validator.routines.UrlValidator;

public class ValidateURL {

	public boolean validate(String url) {
		
		String[] schemes = {"http","https"};
		UrlValidator urlValidator = new UrlValidator(schemes);
		
		if (urlValidator.isValid(url)) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public String determineProtocol(String urlString) {
				
		String protocolString = "";
		
		try {
			
			protocolString = new URL(urlString).getProtocol();
			
		} catch (MalformedURLException e) {
			
			System.err.print("invalid URL: " + urlString);
			
		}
			
		return protocolString;		
				
	}
	
}
