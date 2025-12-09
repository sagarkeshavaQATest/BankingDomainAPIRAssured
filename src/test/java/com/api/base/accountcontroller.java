package com.api.base;



import io.restassured.response.Response;

public class accountcontroller extends BaseService {
           private static final String BASE_URL="/api/accounts";
           
           

           public Response postacc(Object payload,String token) { 
                setAuthtoken(token);
           	return postrequest(payload,BASE_URL);	
           }
           
           public Response getaccnumb(String numb,String token) {
       		setAuthtoken(token);
       		return getreques(BASE_URL+"/"+numb);
       	}
           
           public Response getuser(String token) {
       		setAuthtoken(token);
       		return getreques(BASE_URL+"/"+"user");
       	}
       	}

