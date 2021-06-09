package com.JSON.ORG;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class GetRequestJSON {
	
	
	//Get Request method
	@Test
	public  static void getRequest() {
		Response response=given().contentType(ContentType.JSON)
		.when().get("http://localhost:3000/TestApi ");
		JSONArray jarry=new JSONArray(response.asString());
	     int size=jarry.length();
	     System.out.println(size);
     for(int i=0;i<size;i++) {//this loop for outer Json Array
    	 JSONObject job=jarry.getJSONObject(i);//invoke json object by json array object
    	 JSONArray innerArray= job.getJSONArray("address");//for inner array(address is attribute)
    	 for(int j=0;j<innerArray.length();j++) {
    	 JSONObject innerObj=innerArray.getJSONObject(j);
    	 if(innerObj.get("pin").equals("203001")) {
    	 System.out.println("pin code is:: "+innerObj.get("pin"));
    	 System.out.println("city name is:: "+innerObj.get("city"));
    	 }
    	 }  			
    	// JSONArray array=new JSONArray(job);   	
    	//JSONObject addObj=array.getJSONObject(j);
    //String pin=	addObj.get("pin").toString();
   	// System.out.println(innerArray.toString());
	 
	     }
	
	}

}