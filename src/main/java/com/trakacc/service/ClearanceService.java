package com.trakacc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
}
