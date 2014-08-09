package com.rest.shopping.enums;

public enum GenderEnum {

	MALE("Male"), FEMALE("Female");

	private String gender;

	private GenderEnum(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

}
