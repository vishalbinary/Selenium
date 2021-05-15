package APIAutoation.API_Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

import  static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest {

	public static void main(String[] args) throws FileNotFoundException  {
		File file=new File("../API_Automation/Vishal.json");
		FileInputStream fis=new FileInputStream(file);
		JSONTokener token=new JSONTokener(fis);
		JSONObject json=new JSONObject(token);
		Response response= 
				given().contentType(ContentType.JSON)
				.body(json.toString()).post("http://localhost:3000/TestApi");
		System.out.println(response.getStatusCode());
		

	}

}
