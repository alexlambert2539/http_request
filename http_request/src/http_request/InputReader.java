package http_request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.apache.commons.validator.routines.UrlValidator;

public class InputReader {

	public ArrayList<String> readInput() {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		try {
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String inputString;
			
			while ((inputString = bufferedReader.readLine()) != null) {
							
				if (!inputString.isEmpty()) {
					
					if (checkUrlValidity(inputString)) {
					
						arrayList.add(inputString);
					
					}
					
				} else {
					
					break;
					
				}
				
			}
						
		}
		
		catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		return arrayList;
		
	}
	
	private boolean checkUrlValidity(String sourceUrl) {
		
		String[] schemes = {"http","https"};
		UrlValidator urlValidator = new UrlValidator(schemes);
		
		if (urlValidator.isValid(sourceUrl)) {
			
			return true;
			
		} else {
			
			System.err.println("Invalid URL: " + sourceUrl);
			
			return false;
			
		}
		
	}
	
}
