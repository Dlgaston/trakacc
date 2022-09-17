package com.trakacc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trakacc.entity.Commission;
import com.trakacc.entity.User;
import com.trakacc.repo.CommissionRepo;
import com.trakacc.repo.UserRepo;

@Service
public class CommissionService {
	
	@Autowired
	CommissionRepo commRepo;
	@Autowired
	UserService userService;
	@Autowired
	UserRepo userRepo;
	
	public Commission newCommission(Long id, Commission commission) {
		User account = userService.getAccount(id);
		Commission newCom = commission;
		commRepo.save(newCom);
		account.getCommissions().add(newCom);
		userRepo.save(account);
		return newCom;
	}
	

}
