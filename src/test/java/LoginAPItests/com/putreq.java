package LoginAPItests.com;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.Usermanagementprofile;
import com.api.models.LoginRequest.LoginRequest;
import com.api.models.LoginRequest.Modifyprofile;
import com.api.models.LoginResponse.LoginResponse;
import com.api.models.LoginResponse.ProfileResponse;

import io.restassured.response.Response;

public class putreq {
	
	@Test
	
	public void creationtest() {
		
		AuthService auth=new AuthService();
		Response response=auth.login(new LoginRequest("transfer","?Sks864321"));
		LoginResponse loginresponse=response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		
		
		System.out.println("---------------------------------------------------------------");
       
		
		Usermanagementprofile Usermanagementprofile=new Usermanagementprofile();
		response=Usermanagementprofile.getprofile(loginresponse.getToken());
		ProfileResponse ProfileResponse=response.as(ProfileResponse.class);
		Assert.assertEquals(ProfileResponse.getUsername(), "transfer");
		System.out.println(response.asPrettyString());
		
		
		System.out.println("-------------------------------------------------------------------");
		
		Modifyprofile Modifyprofile=new Modifyprofile.Builder()
				.firstame("rampa")
				.lastName("mohan")
				.email("tramper@gmail.com")
				.mobileNumber("985224455")
				.builderm();
		
		response=Usermanagementprofile.putprofile(loginresponse.getToken(), Modifyprofile);
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		
		

	}	
}

