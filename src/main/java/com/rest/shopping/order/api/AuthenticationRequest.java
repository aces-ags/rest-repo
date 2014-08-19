package com.rest.shopping.order.api;

import java.io.Serializable;

import org.joda.time.DateTime;

public class AuthenticationRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private String authenticationKey;
	private DateTime expiryDate;
	private DateTime lastSuccessfulLogin;
	private boolean expired;

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

	public DateTime getLastSuccessfulLogin() {
		return lastSuccessfulLogin;
	}

	public void setLastSuccessfulLogin(DateTime lastSuccessfulLogin) {
		this.lastSuccessfulLogin = lastSuccessfulLogin;
	}

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

}
