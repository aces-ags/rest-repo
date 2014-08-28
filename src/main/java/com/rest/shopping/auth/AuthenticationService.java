package com.rest.shopping.auth;

import org.springframework.stereotype.Service;

@Service("authenticationService")
public class AuthenticationService {

	// TODO implement logic to generate random unique keys
	public void generateAuthToken() {
		AuthKeyGenerator.generateRandomKey();
	}

	public void checkValidAuthToken() {

	}

}
