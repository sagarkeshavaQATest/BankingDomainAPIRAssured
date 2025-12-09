package LoginAPItests.com;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.LoginRequest.LoginRequest;
import com.api.models.LoginRequest.SignupRequest;
import com.api.models.LoginResponse.LoginResponse;

import io.restassured.response.Response;

public class AccountCreationtest {
	
	@Test
	
	public void creationtest() {
		
	
	
	
SignupRequest signuprequest=new SignupRequest.Builder()
                            .username("sagarty1234@")
                            .password("?Sks864321")
                            .email("trampertech2828@gmail.com")
                            .firstName("Sagar")
                            .lastName("keshava")
                            .mobileNumber("9462666488")
                            .build();

AuthService authservice=new AuthService();
Response response=authservice.signup(signuprequest);
System.out.println(response.asPrettyString());
System.out.println(response.statusCode());
Assert.assertEquals(response.statusCode(), 200);


LoginRequest loginrequest=new LoginRequest("sagarty1234@","?Sks864321");
           AuthService auth=new AuthService();
           Response r=auth.login(loginrequest);
           System.out.println(r.asPrettyString());
         LoginResponse loginresponse=r.as(LoginResponse.class);
         System.out.println("yout token = " +loginresponse.getToken());
         

	}	
}

