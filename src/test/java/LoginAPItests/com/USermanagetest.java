package LoginAPItests.com;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.Usermanagementprofile;
import com.api.models.LoginRequest.LoginRequest;

import com.api.models.LoginResponse.LoginResponse;
import com.api.models.LoginResponse.ProfileResponse;

import io.restassured.response.Response;

public class USermanagetest {
	
	@Test
	
	public void creationtest() {
		
		
		AuthService auth=new AuthService();
		Response response=auth.login(new LoginRequest("transfer","?Sks864321"));
		LoginResponse loginresponse=response.as(LoginResponse.class);
		System.out.println(loginresponse.getToken());
		
	
       Usermanagementprofile usermanagementprofile=new Usermanagementprofile();
        response= usermanagementprofile.getprofile(loginresponse.getToken());
        ProfileResponse ProfileResponse=response.as(ProfileResponse.class);
        System.out.println(response.asPrettyString());
       
        
        
        Assert.assertEquals(ProfileResponse.getUsername(), "transfer");
        
        System.out.println("Assertion has passed");
       

	}	
}

