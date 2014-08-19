package com.rest.shopping.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	@Autowired
	private AuthKeyGenerator authKeyGenerator;

	// TODO implement logic to generate random unique keys
	public void generateAuthToken() {
		authKeyGenerator.generateRandomKey();
	}

	public void checkValidAuthToken() {

	}

}
