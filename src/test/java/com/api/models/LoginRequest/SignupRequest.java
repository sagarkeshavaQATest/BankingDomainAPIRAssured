package com.api.models.LoginRequest;

public class SignupRequest {
	
	@Override
	public String toString() {
		return "SignupRequest [username=" + username + ", password=" + password + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	private String username;
	private String password; 
	private String  email; 
	private String firstName;  
	private String  lastName;  
	private String mobileNumber;
	public SignupRequest(String username, String password, String email, String firstName, String lastName,
			String mobileNumber) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}  
	
	
public static class Builder{
	
	private String username;
	private String password; 
	private String  email; 
	private String firstName;  
	private String  lastName;  
	private String mobileNumber;
	
	
	public Builder username(String username) {
		
		this.username=username;
		Builder x=this;
		return x;
		
}
	
public Builder password(String password) {
		
		this.password=password;
		return this;
}

public Builder email(String email) {
	
	this.email=email;
	return this;	
}

public Builder firstName(String firstName) {
	
	this.firstName=firstName;
	return this;	
}

public Builder lastName(String lastName) {
	
	this.lastName=lastName;
	return this;	
}

public Builder mobileNumber(String mobileNumber) {
	
	this.mobileNumber=mobileNumber;
	return this;
}


public 	SignupRequest build() {
	SignupRequest signuprequest=new SignupRequest(username,password,email,firstName,lastName,mobileNumber);
	return signuprequest;
}



}
	
	

}
