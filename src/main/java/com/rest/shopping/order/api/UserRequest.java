package com.rest.shopping.order.api;

import java.io.Serializable;

public class UserRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	private String confirmPassword;
	private String userName;
	private String firstName;
	private String lastName;
	private AuthenticationRequest authRequest;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public AuthenticationRequest getAuthRequest() {
		return authRequest;
	}

	public void setAuthRequest(AuthenticationRequest authRequest) {
		this.authRequest = authRequest;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
