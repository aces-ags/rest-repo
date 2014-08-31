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

	public static void main(String[] args) {
		String userName = "abcDef";

		String randomKey1 = AuthKeyGenerator.generateRandomKey(userName);
		String randomKey2 = AuthKeyGenerator.generateRandomKey(userName);

		if (randomKey1.equals(randomKey2)) {
			System.out.println("idempotent operation");
			System.out.println("randomKey1 " + randomKey1);
			System.out.println("randomKey2 " + randomKey2);
		} else {
			System.out.println("idempotent operation fail");
		}
	}
}
