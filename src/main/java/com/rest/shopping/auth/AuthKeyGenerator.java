package com.rest.shopping.auth;

import java.util.UUID;

public class AuthKeyGenerator {

	// TODO implement logic to generate random unique keys
	public static String generateRandomKey() {
		return UUID.randomUUID().toString();
	}

	public static String generateRandomKey(String userName) {
		return UUID.nameUUIDFromBytes(userName.getBytes()).toString();
	}
}
