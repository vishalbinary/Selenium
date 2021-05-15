//This code having get, post and delete methods which can be used
package APIAutoation.API_Automation;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileInputStream;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/************************************/
//given request
//given-----content----of json type
//when ----------get request
public class GetRequest {
	private static Response response;
	private static RequestSpecification request;
	public static JSONTokener setUpConnection() throws Exception {
		File file=new File("../API_Automation/Vishal.json");
		FileInputStream fis=new FileInputStream(file);
		JSONTokener token=new JSONTokener(fis);
		return token;
	
	}
  //This method is used to hit the get request(shows whole data of api)
	public static void getRequest() throws Exception {
		response = given().contentType(ContentType.JSON).when().get("http://localhost:3000/TestApi");
		System.out.println("====getRequest method is invoked====");
		response.prettyPrint();
		System.out.println("===================");

	}
    //This method is used to hit the get request using id
	public static void getRequestById(int id) {
		response = given().contentType(ContentType.JSON).when().get("http://localhost:3000/TestApi" + "/" + id);
		System.out.println("====getRequestById method is invoked====");

		response.prettyPrint();
		System.out.println("===================");

	}
    //This method is used to hit the post request
	public static void postRequest(JSONObject json) {
		
		
		System.out.println("====Class(GetRequest)::Method(postRequest) is invoked====");
		request = RestAssured.given().contentType(ContentType.JSON);//content type is defined
		request.when().body(json.toString());//body is sent to TestApi
        //post request is stored in a Response reference variable
		 response = request.post("http://localhost:3000/TestApi");//post request is hit
		Assert.assertEquals(response.getStatusCode(), 201);//status is verified
		System.out.println(response.statusLine());
		System.out.println("===========Post data is::==========");
		response.prettyPrint();
		System.out.println("===================");

	}
	//This method is used to put the json data
	public static void putRequestById(JSONObject json, int id) {
		request=RestAssured.given().contentType(ContentType.JSON);
		request.when().body(json.toString());//body data is sent to TestApi
		response=request.put("http://localhost:3000/TestApi"+"/"+id);
		Assert.assertEquals(response.getStatusCode(), 200);//status is verified
		System.out.println(response.statusLine());
		System.out.println("===========Put data is::==========");
		response.prettyPrint();
		System.out.println("===================");
	
	}
	
   //This method is used to delete the data using id
	public static void deleteRequestById(int id) {
		request = RestAssured.given();
		// Response response=request.when().delete("http://localhost:3000/TestApi");
		Response response = request.when().delete("http://localhost:3000/TestApi" + "/" + id);
		System.out.println("====deleteRequestById method is invoked====");
		Assert.assertEquals(response.statusCode(), 200);
		System.out.println("Data delete with id:" + id + " : " + response.getStatusLine());

	}

}
