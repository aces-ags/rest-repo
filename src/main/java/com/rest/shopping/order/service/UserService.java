package com.rest.shopping.order.service;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.shopping.auth.AuthKeyGenerator;
import com.rest.shopping.mail.service.EmailNotificationService;
import com.rest.shopping.order.api.User;
import com.rest.shopping.order.api.UserRequest;
import com.rest.shopping.order.component.UserValidationComponent;

@Service
@Path("/user")
public class UserService {

	@Autowired
	private UserValidationComponent userValidationComponent;
	@Autowired
	private EmailNotificationService emailService;

	public void registerUser(UserRequest userRequest) {
		User newUser = userRequest.getUser();
		boolean validUser = userValidationComponent.validateUser(newUser);
		if (!validUser) {
			// TODO send appropriate response code and message
		}
		// Generate registrationToken and send it to user for activation at
		// registered email account
		String activationToken = AuthKeyGenerator.generateRandomKey(newUser
				.getUserName());

		// TODO generate email and send activationToken
		emailService.sendEmail();
	}

	public void retrieveUser() {

	}

	public void updateUser() {

	}

	public void activateUser() {

	}
}
