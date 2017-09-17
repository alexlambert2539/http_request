package http_request;

import org.apache.commons.validator.routines.UrlValidator;

public class ValidateURL {

	public boolean validate(String url) {
		
		String[] schemes = {"http","https"};
		UrlValidator urlValidator = new UrlValidator(schemes);
		
		if (urlValidator.isValid(url)) {
			
			return true;
			
		} else {
			
			System.err.println("Invalid URL: " + url);
			
			return false;
			
		}
		
	}
	
}
