package LoginAPItests.com;



import org.testng.annotations.Test;
import com.api.base.AuthService;
import com.api.models.LoginRequest.LoginRequest;
import com.api.models.LoginResponse.LoginResponse;

import io.restassured.response.Response;


public class loginapitest2 {
	
	@Test(description="verify whether api is working fine")	
	public void restassured() {
		LoginRequest loginRequest=new LoginRequest("rampa","?Sks864321");
		AuthService auth=new AuthService();
		Response r=auth.login(loginRequest);
		System.out.println(r.asPrettyString());
		LoginResponse loginresponse=r.as(LoginResponse.class);
		System.out.println("Your token data is = "+loginresponse.getToken());
	}

}
