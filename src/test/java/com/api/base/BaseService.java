package com.api.base;

import static io.restassured.RestAssured.*;

import com.api.models.LoginRequest.LoginRequest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	private final static String BASE_URI="http://64.227.160.186:8080/";
	private RequestSpecification requestspecification;
	
	public BaseService() {
		requestspecification=given().baseUri(BASE_URI);
	}
	
	
	
	protected RequestSpecification setAuthtoken(String token) {
		return requestspecification.header("Authorization","Bearer "+token);
	}
	
	
	protected Response getreques(String endpoint) {
		return requestspecification.get(endpoint);
		
	}
	
	protected Response postrequest(Object payload,String endpoint) {
		return requestspecification.contentType(ContentType.JSON).body(payload).post(endpoint);
		
	}
	
	protected Response putrequest(Object payload,String endpoint) {
		return requestspecification.contentType(ContentType.JSON).body(payload).put(endpoint);
		
	}
	
	protected Response postrequest(String baseUrl,String payload,String endpoint) {
		return requestspecification.baseUri(baseUrl).contentType(ContentType.JSON).body(payload).post(endpoint);
		
	}

}
