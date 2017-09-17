package http_request;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonFormat {

	public Object toJson(RequestProperties requestProperties ) {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(requestProperties);
				
		return json;
		
	}
	
}
