package com.rest.shopping.order.api;

import java.io.Serializable;

public class UserRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	private String confirmPassword;
	private String firstName;
	private String lastName;

}
