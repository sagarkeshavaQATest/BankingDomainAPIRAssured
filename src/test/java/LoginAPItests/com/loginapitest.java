package LoginAPItests.com;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class loginapitest {
	
	@Test(description="APi request will starts now")	
	public void restassured() {
		
		 
		Response r=given()
				.baseUri("http://64.227.160.186:8080")
				.header("Content-Type","application/json")
				.body("{\"username\": \"rampa\",\"password\": \"?Sks864321\"}")
				.post("/api/auth/login");
	 System.out.println(r.asPrettyString());
	 
	 System.out.println(r.statusCode());
	 
	 Assert.assertEquals(r.statusCode(), 200);
		
	}

}
