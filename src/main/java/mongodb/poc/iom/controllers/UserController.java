package mongodb.poc.iom.controllers;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mongodb.poc.iom.model.User;
import mongodb.poc.iom.repo.interfac.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> fetchAllUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping("/user")
	public ResponseEntity<?> insertUsers(@RequestBody User user){
		user.setUserId(ObjectId.get());
		userRepository.save(user);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
