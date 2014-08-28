package com.rest.shopping.order.api;

import java.io.Serializable;

public class UserRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private User user;
	private AuthenticationRequest authRequest;

	public AuthenticationRequest getAuthRequest() {
		return authRequest;
	}

	public void setAuthRequest(AuthenticationRequest authRequest) {
		this.authRequest = authRequest;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
