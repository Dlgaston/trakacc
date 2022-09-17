package com.trakacc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trakacc.entity.User;
import com.trakacc.repo.UserRepo;
import com.trakacc.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {

	@Autowired
	UserRepo userRepo;
	@Autowired
	UserService userService;

	@RequestMapping(value = "/create-account", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<User> createAccount() {
		User account = new User();

		return new ResponseEntity<>(account, HttpStatus.OK);
	}

	@RequestMapping(value = "/create-account", method = RequestMethod.POST)
	public ResponseEntity<User> handleCreateAccount(@Valid @RequestBody User account) {
		userRepo.save(account);
		return new ResponseEntity<>(account, HttpStatus.OK);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<User> loginAccount(@RequestBody User account) {
		User loginAccount = userRepo.login(account.getEmail(), account.getPassword());
		if (loginAccount != null) {
			return new ResponseEntity<>(loginAccount, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}
	
	@RequestMapping(value = "/get-account/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> getAccount(@PathVariable("id") Long id) {

		return new ResponseEntity<>(userService.getAccount(id), HttpStatus.OK);
	}
	@RequestMapping(value = "/update-account/{id}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<User> updateAccount(@PathVariable("id") Long id, @RequestBody User user) {

		return new ResponseEntity<>(userService.updateAccount(user, id), HttpStatus.OK);
	}
	
	@RequestMapping(value="/delete-account/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteAccount(@PathVariable ("id") Long id) {
		userRepo.delete(userService.getAccount(id));
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
