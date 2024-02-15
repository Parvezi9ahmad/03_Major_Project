package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.User;
import in.ashokit.service.SSAService;

@RestController
public class SSAController {

	@Autowired
	private SSAService service;
	
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		
		return new ResponseEntity<>(service.SaveUser(user),HttpStatus.OK);
	}
}
