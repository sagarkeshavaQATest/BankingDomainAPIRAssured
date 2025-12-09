package com.api.base;

import com.api.models.LoginRequest.Modifyprofile;

import io.restassured.response.Response;

public class Usermanagementprofile extends BaseService{
	
	private static final  String BASE_URL="/api/users/";
	
	
	
	public Response getprofile(String token) {
		setAuthtoken(token);
		return getreques(BASE_URL+"profile");
	}
	
	public Response putprofile(String token,Modifyprofile modifyprofile) {
		setAuthtoken(token);
		return putrequest(modifyprofile,BASE_URL+"profile");
	}
	
	
	

}
