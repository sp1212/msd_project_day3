package com.bah.project.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.project.api.JWTUtil;
import com.bah.project.api.Token;
import com.bah.project.api.TokenRequestData;

@RestController
@RequestMapping("/token")
public class tokenAPI {

	JWTUtil jwtUtil = new JWTMockUtil();

	@PostMapping(consumes = "application/json")
	public ResponseEntity<?> getToken(@RequestBody TokenRequestData tokenRequestData) {

		String username = tokenRequestData.getUsername();
		String password = tokenRequestData.getPassword();
		String scopes = tokenRequestData.getScopes();

		if (username != null && username.length() > 0 && password != null && password.length() > 0
				/*&& Authenticator.checkPassword(username, password)*/) {
			Token token = jwtUtil.createToken(scopes);
			ResponseEntity<?> response = ResponseEntity.ok(token);
			return response;
		}
		// bad request
		return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();

	}
}
