package LoginAPItests.com;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.accountcontroller;
import com.api.models.LoginRequest.LoginRequest;
import com.api.models.LoginRequest.acccontr;
import com.api.models.LoginResponse.LoginResponse;

import io.restassured.response.Response;

public class acctest {
	
	@Test
	
	public void acctests() {
		AuthService auth=new AuthService();
		Response response=auth.login(new LoginRequest("transfer","?Sks864321"));
		LoginResponse LoginResponse=response.as(LoginResponse.class);
		System.out.println(LoginResponse.getToken());
		
		accountcontroller accountcontroller=new accountcontroller();
		response=accountcontroller.postacc(new acccontr("SAVINGS", "MainBranch"), LoginResponse.getToken());
		System.out.println(response.asPrettyString());
	}
	

}
