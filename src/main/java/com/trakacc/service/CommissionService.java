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
	public ResponseEntity<List<Commission>> getAllCommissions(@PathVariable ("id") Long id){
		Optional<User>isUser = userRepo.findById(id);
		
		List<Commission> cList = new ArrayList<>();
		
		if(isUser.isPresent()) {
			User person = isUser.get();
			cList = person.getCommissions();
			return new ResponseEntity<>(cList, HttpStatus.OK);
		}
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		
	}

}
