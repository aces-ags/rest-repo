package com.rest.shopping.order.api;

import org.joda.time.DateTime;

public class AuthenticationRequest {

	private String authenticationKey;
	private DateTime expiryDate;
	private DateTime lastLogin;

	public String getAuthenticationKey() {
		return authenticationKey;
	}

	public void setAuthenticationKey(String authenticationKey) {
		this.authenticationKey = authenticationKey;
	}

	public DateTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(DateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	public DateTime getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(DateTime lastLogin) {
		this.lastLogin = lastLogin;
	}

}
