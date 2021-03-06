package http_request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadInput {

	public ArrayList<String> readInput() {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		try {
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String inputString;
			
			while ((inputString = bufferedReader.readLine()) != null) {
							
				if (!inputString.isEmpty()) {
					
					arrayList.add(inputString);
					
				} else {
					
					System.out.println("processing request... ");
					
					break;
					
				}
				
			}
						
		}
		
		catch(IOException e) {
			
			System.err.println("unable to process input stream.");
			
		}
		
		return arrayList;
		
	}
	
}
