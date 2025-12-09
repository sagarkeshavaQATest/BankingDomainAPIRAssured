package LoginAPItests.com;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class logintestraw {
	
	@Test
	
	public void apitest() {
		
		Response r=given()
				   .relaxedHTTPSValidation()
				   .baseUri("https://www.shoppersstack.com")
				   .header("Content-Type","application/json")
				   .body("{\"email\": \"tarun55@gmail.com\", \"password\": \"?Sks864321\", \"role\": \"SHOPPER\"}")
				   .post("/shopping/users/login");
		System.out.println(r.asPrettyString());
		System.out.println(r.getStatusCode());
		Assert.assertEquals(r.getStatusCode(), 200);
		
	}

}
