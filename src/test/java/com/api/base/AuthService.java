package com.api.base;

import java.util.HashMap;


import com.api.models.LoginRequest.LoginRequest;
import com.api.models.LoginRequest.SignupRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService{
	
	private static final  String BASE_URL="/api/auth/";
	
        public Response login(LoginRequest loginRequest) { 	
        	return postrequest(loginRequest,BASE_URL+"login");	
        }
        
        public Response signup(SignupRequest signupRequest) { 	
        	return postrequest(signupRequest,BASE_URL+"signup");	
        }
        
        public Response Forgotpassword(String emailaddress) { 
        	  HashMap<String, String> payload=new HashMap<String, String>();
        	  payload.put("email", emailaddress);
        	return postrequest(payload,BASE_URL+"forgot-password");	
        } 

}
