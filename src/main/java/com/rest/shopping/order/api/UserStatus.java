package com.rest.shopping.order.api;

import java.io.Serializable;

import org.joda.time.DateTime;

public class UserStatus implements Serializable {

	private static final long serialVersionUID = 1L;
	private String activationToken;
	private DateTime activationDate;
	private DateTime lastLogin;
	private boolean disabledAccount;
	private int loginAttempt;

	public String getActivationToken() {
		return activationToken;
	}

	public void setActivationToken(String activationToken) {
		this.activationToken = activationToken;
	}

	public DateTime getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(DateTime activationDate) {
		this.activationDate = activationDate;
	}

	public DateTime getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(DateTime lastLogin) {
		this.lastLogin = lastLogin;
	}

	public boolean isDisabledAccount() {
		return disabledAccount;
	}

	public void setDisabledAccount(boolean disabledAccount) {
		this.disabledAccount = disabledAccount;
	}

	public int getLoginAttempt() {
		return loginAttempt;
	}

	public void setLoginAttempt(int loginAttempt) {
		this.loginAttempt = loginAttempt;
	}

}
