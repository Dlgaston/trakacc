package com.trakacc.controller;

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

import com.trakacc.entity.Commission;
import com.trakacc.repo.CommissionRepo;
import com.trakacc.repo.UserRepo;
import com.trakacc.service.CommissionService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CommController {
	
	@Autowired
	UserRepo userRepo;
	@Autowired
	CommissionRepo commRepo;
	@Autowired
	CommissionService commService;
	
	@RequestMapping(value = "/create-commission", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Commission> createCommission(){
		Commission comm = new Commission();
		return new ResponseEntity<>(comm, HttpStatus.OK);
	}
	@RequestMapping(value = "/add-commission/{id}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Commission> addCommission(@PathVariable ("id") Long id, @RequestBody Commission comm){
		Commission addComm = commService.newCommission(id, comm);
		return new ResponseEntity<>(addComm, HttpStatus.OK);
	}
}
