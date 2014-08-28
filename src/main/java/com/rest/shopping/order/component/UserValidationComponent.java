package com.rest.shopping.order.component;

import org.springframework.stereotype.Component;

import com.rest.shopping.order.api.User;

@Component("userValidationComponent")
public class UserValidationComponent {

	public boolean validateUser(User user) {
		boolean validUser = false;
		if (user == null) {
			return validUser;
		}

		return validUser;
	}
}
