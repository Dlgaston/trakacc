package com.trakacc.controller;

import java.util.List;

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

import com.trakacc.entity.Clearance;
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
	
	@RequestMapping(value = "/add-commission", method = RequestMethod.GET)
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
	@RequestMapping(value = "get-commissions/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Commission>> getAllClearances(@PathVariable("id") Long id) {

		return commService.getAllCommissions(id);

	}
	@RequestMapping(value = "delete-commission/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<String> deleteCommission(@PathVariable("id") Long id) {
		String msg = "";
		
		try {
			commRepo.deleteById(id);
			msg = "Commission deleted";
			return new ResponseEntity<>(msg, HttpStatus.OK);
			
		} catch (Exception e) {
			
			msg = "Error in deleting Commission";
			return new ResponseEntity<>(msg, HttpStatus.BAD_REQUEST);
		}

	}
	
}
