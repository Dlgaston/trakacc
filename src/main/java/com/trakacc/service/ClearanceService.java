package com.trakacc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.trakacc.entity.Clearance;
import com.trakacc.entity.User;
import com.trakacc.repo.ClearanceRepo;
import com.trakacc.repo.UserRepo;

@Service
public class ClearanceService {

	
	@Autowired
	ClearanceRepo clearanceRepo;
	@Autowired
	UserService userService;
	@Autowired
	UserRepo userRepo;
	
	public User newClearance(Long id, Clearance clearance) {
		User account = userService.getAccount(id);
		Clearance newClear = clearance;
		clearanceRepo.save(newClear);
		account.getClearances().add(newClear);
		userRepo.save(account);
		return account;
	}
	
	public ResponseEntity<List<Clearance>> getAllClearances(@PathVariable ("id") Long id){
		Optional<User>isUser = userRepo.findById(id);
		
		List<Clearance> cList = new ArrayList<>();
		
		if(isUser.isPresent()) {
			User person = isUser.get();
			cList = person.getClearances();
			return new ResponseEntity<>(cList, HttpStatus.OK);
		}
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		
	}
	
}
