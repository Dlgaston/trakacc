package com.trakacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trakacc.entity.Nwdtp;
import com.trakacc.entity.User;
import com.trakacc.repo.NwdtpRepo;
import com.trakacc.repo.UserRepo;
import com.trakacc.service.NwdtpService;
import com.trakacc.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class NwdtpController {
	
	@Autowired
	NwdtpService nwdtpServ;
	
	@Autowired
	NwdtpRepo nwdtpRepo;
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	UserService	userServ;
	

	@RequestMapping(value = "/add-nwdtp", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Nwdtp> createNwdtp(Nwdtp body) {
		Nwdtp nwdtp = new Nwdtp();
		
		return new ResponseEntity<>(nwdtp, HttpStatus.OK);
	}

	@RequestMapping(value = "/ojt-expiration/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Nwdtp> newOjtExpiration(@PathVariable("id")Long id){
		User person = userServ.getAccount(id);
		Nwdtp personNwdtp = person.getNwdtp();
		if(personNwdtp.getHasNwdtp() == true) {
			personNwdtp.setOjt(personNwdtp.getOjt().plusDays(60));
			
			return new ResponseEntity<>(personNwdtp, HttpStatus.OK);
		} 
		return null;		
	}
	
	
}
