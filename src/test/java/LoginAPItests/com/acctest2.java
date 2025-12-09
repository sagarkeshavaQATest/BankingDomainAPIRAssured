package LoginAPItests.com;


import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.accountcontroller;
import com.api.models.LoginRequest.LoginRequest;
import com.api.models.LoginRequest.acccontr;
import com.api.models.LoginResponse.LoginResponse;
import com.api.models.LoginResponse.accountsResponse;

import io.restassured.response.Response;

public class acctest2 {
	
	@Test
	
	public void acctests() {
		AuthService auth=new AuthService();
		Response response=auth.login(new LoginRequest("transfer","?Sks864321"));
		LoginResponse LoginResponse=response.as(LoginResponse.class);
		
		
		accountcontroller accountcontroller=new accountcontroller();
		
		System.out.println("------------------------------------------------------");
		response=accountcontroller.getuser(LoginResponse.getToken());
		System.out.println(response.asPrettyString());
	}
	

}
