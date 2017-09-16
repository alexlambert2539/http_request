package http_request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InputReader {

	public ArrayList<String> readInput() {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		try {
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String inputString;
			
			while ((inputString = bufferedReader.readLine()) != null) {
							
				if (!inputString.isEmpty()) {
					
					arrayList.add(inputString);
					
				} else {
					
					break;
					
				}
				
			}
			
			System.out.println("contents: " + arrayList);
			System.out.println("number of items: " + arrayList.size());
						
		}
		
		catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		return arrayList;
		
	}
	
}
