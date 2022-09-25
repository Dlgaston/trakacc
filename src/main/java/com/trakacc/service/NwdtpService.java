package com.trakacc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trakacc.repo.NwdtpRepo;
import com.trakacc.repo.UserRepo;

@Service
public class NwdtpService {
	
	@Autowired
	NwdtpRepo nwdtpRepo;
	@Autowired
	UserRepo userRepo;
	
	

}
