// given, when , then bdd()
package APIAutoation.API_Automation;

import java.io.File;
import java.io.FileInputStream;
import java.util.Random;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostDemo  {
	private static Integer id=0;
	static String data;
	static JSONObject json;
	@BeforeMethod
	public static void readData() throws Exception {
		
		File file=new File("../API_Automation/Vishal.json");
		FileInputStream fis=new FileInputStream(file);
		JSONTokener token=new JSONTokener(fis);//file data is stored in json reference
		 json=new JSONObject(token);//data is add in jsonObject reference
		 data=json.toString();
		 System.out.println("=======Before Method is running=======");
		 System.out.println(data);//json data is print as string
		 
		Random  rand=new Random();
		while(true) {
		 id=rand.nextInt();
		if(id>0)break; 
		}
		System.out.println("Generated Id is :: "+id );	
		data=data.replaceAll(Pattern.quote("{{"+"id"+ "}}"), id.toString());
		//data=data.replaceAll(("{{"+"id"+"}}"), id.toString() );
	}
		//now data is to be posted
	@Test
	public static void postData(){
		  RequestSpecification request=RestAssured.given().contentType(ContentType.JSON);
		 Response response=request.when().body(data).post("http://localhost:3000/TestApi");
		 Assert.assertEquals(response.getStatusCode(), 201);
		 System.out.println(response.statusLine());
		 System.out.println("===========post data is::==========");
		System.out.println(response.asString());
		System.out.println("Genereted id is:: "+id);
		 
	}

}