package http_request;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		while(true) {
			
			ReadInput readInput = new ReadInput();
			Request request = new Request();
			JsonFormat jsonFormat = new JsonFormat();
			
			System.out.println("enter list of public web addresses");
			
			ArrayList<String> arrayList = readInput.readInput();
			
			for (int i=0; i<arrayList.size(); i++) {
							
				try {
					
					RequestProperties requestProperties = request.getRequest(arrayList.get(i));
					
					System.out.println(jsonFormat.toJson(requestProperties));
					
				} catch (IOException e) {
					
					System.err.println("unable to perform GET request: " + arrayList.get(i));
					
				}
				
			}
			
			System.out.println("finished");
			
		}
					
	}
	
}
