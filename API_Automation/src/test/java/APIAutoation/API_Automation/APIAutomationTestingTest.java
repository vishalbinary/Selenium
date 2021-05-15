package APIAutoation.API_Automation;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class APIAutomationTestingTest {
	JSONTokener token;
	JSONObject json;
	  int id;

 
  @Test
  public void verifyGetRequest() throws Exception {
   GetRequest.getRequest();
  }

  @Test
  public void verifyGetRequestById() {
	   id=0;
    GetRequest.getRequestById(id);
  }

  @Test
  public void verifyPostRequest() throws Exception {
     token=GetRequest.setUpConnection();
     json=new JSONObject(token);
    GetRequest.postRequest(json);
    
  }

  @Test
  public void verifyPutRequest() throws Exception {
	   id=0;
	     token=GetRequest.setUpConnection();
	     json=new JSONObject(token);
	    GetRequest.putRequestById(json, id);
  }
  @Test
  public void verifyDeleteRequestTest() {
	   id=121212112;
	  GetRequest.deleteRequestById(id);
  
  }

}
