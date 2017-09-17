package http_request;

import com.google.gson.Gson;

public class JsonFormat {

	public Object toJson(RequestProperties requestProperties ) {
		
		Gson gson = new Gson();
		String json = gson.toJson(requestProperties);
				
		return json;
		
	}
	
}
