package com.trakacc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trakacc.entity.User;
import com.trakacc.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;

	public User getAccount(Long id) {
		Optional<User> getAccount = userRepo.findById(id);
		if(getAccount.isPresent()) {
			User found = getAccount.get();
			return found;
		}
		return null;
	}
	
	public User updateAccount(User user, Long id) {
			Optional<User> getAccount = userRepo.findById(id);
			if(getAccount.isPresent()) {
				User account = getAccount.get();
				account.setEmail(user.getEmail());
				account.setfName(user.getfName());
				account.setlName(user.getlName());
				account.setPassword(user.getPassword());
				account.setSeniority(user.getSeniority());
								
				return userRepo.save(account);
			} 
				return null;
		
	}
	
}
