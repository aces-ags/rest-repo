package com.rest.shopping.auth;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptionUtil {

	private static final String ALGORITHM = "MD5";
	public static final String EMPTY_STRING = "";

	public static String encryptString(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance(ALGORITHM);
			byte[] passBytes = input.getBytes();
			md.reset();
			byte[] digested = md.digest(passBytes);
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < digested.length; i++) {
				sb.append(Integer.toHexString(0xff & digested[i]));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return EMPTY_STRING;
	}
}
