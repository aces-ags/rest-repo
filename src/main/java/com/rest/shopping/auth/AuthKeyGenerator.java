package com.rest.shopping.auth;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component("authKeyGenerator")
public class AuthKeyGenerator {

	// TODO implement logic to generate random unique keys
	public void generateRandomKey() {
		String uuid = UUID.randomUUID().toString();

	}
}
