package LoginAPItests.com;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class Forgotpassword {
	
	@Test(description="APi request will starts now")	
	public void forgotpassword() {
		AuthService auth=new AuthService();
		Response response=auth.Forgotpassword("Sagarkeshava6@gmail.com");
		System.out.println(response.asPrettyString());
		 
		 
		
	}

}
