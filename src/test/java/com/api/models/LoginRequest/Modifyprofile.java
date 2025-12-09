package com.api.models.LoginRequest;



public class Modifyprofile {
	
	@Override
	public String toString() {
		return "Modifyprofile [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + "]";
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
	private String firstName; 
	private String lastName; 
	private String email; 
	private String mobileNumber;
	public Modifyprofile(String firstName, String lastName, String email, String mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
	} 

	 public static class Builder{
		 private String firstName; 
			private String lastName; 
			private String email; 
			private String mobileNumber;
			
			
			public Builder firstame(String firstName){
				  this.firstName=firstName;
				  return this;  
				}
			
			public Builder lastName(String lastName){
				  this.lastName=lastName;
				  return this;  
				}
			
			public Builder email(String email){
				  this.email=email;
				  return this;  
				}
			
			public Builder mobileNumber(String mobileNumber){
				  this.mobileNumber=mobileNumber;
				  return this;  
				}
			
			
			public Modifyprofile builderm() {
				Modifyprofile modifyprofile=new Modifyprofile(firstName,lastName,email,mobileNumber);
				return modifyprofile;
			}
			
			
			
			}
	
	
}
