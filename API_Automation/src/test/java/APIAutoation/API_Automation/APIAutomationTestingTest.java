package APIAutoation.API_Automation;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class APIAutomationTestingTest {
	JSONTokener token;
	JSONObject json;
	  String id;

 //Get Request method All
  @Test
  public void verifyGetRequest() throws Exception {
   GetRequest.getRequest();
  }
//Get Request method using id
  @Test
  public void verifyGetRequestById() {
	   id="254650534";
    GetRequest.getRequestById(id);
  }
//Post Request method
  @Test
  public void verifyPostRequest() throws Exception {
     token=GetRequest.setUpConnection();
     json=new JSONObject(token);
    //GetRequest.postRequest(json);
     System.out.println("Be carefull while runnig Post Request method");
     System.out.println("Post Request method only can run individually");
    
  }
//Put Request method
  @Test
  public void verifyPutRequest() throws Exception {
	   id="947733921";
	     token=GetRequest.setUpConnection();
	     json=new JSONObject(token);
	    GetRequest.putRequestById(json, id);
  }
  //Delete Request method
  @Test
  public void verifyDeleteRequestTest() {
	   id="405030689";
	  GetRequest.deleteRequestById(id);
  
  }

}
