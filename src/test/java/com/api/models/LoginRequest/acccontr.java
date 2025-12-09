package com.api.models.LoginRequest;

public class acccontr {
	
	 @Override
	public String toString() {
		return "acccontr [accountType=" + accountType + ", branch=" + branch + "]";
	}
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 * @return 
	 */
	public acccontr setAccountType(String accountType) {
		this.accountType = accountType;
		return this;
	}
	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	private String accountType;
	 private String branch;
	public acccontr(String accountType, String branch) {
		super();
		this.accountType = accountType;
		this.branch = branch;
	}
}
