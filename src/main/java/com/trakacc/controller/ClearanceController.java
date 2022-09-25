package com.trakacc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
import com.trakacc.entity.User;
import com.trakacc.repo.ClearanceRepo;
import com.trakacc.repo.UserRepo;
import com.trakacc.service.ClearanceService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ClearanceController {

	@Autowired
	UserRepo userRepo;
	@Autowired
	ClearanceService clearServ;
	@Autowired
	ClearanceRepo clearRepo;

	@RequestMapping(value = "/create-clearance", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Clearance> createClearance() {
		Clearance clearance = new Clearance();
		return new ResponseEntity<>(clearance, HttpStatus.OK);
	}

	@RequestMapping(value = "/add-clearance/{id}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<User> addClearance(@PathVariable("id") Long id, @RequestBody Clearance clear) {
		User addClear = clearServ.newClearance(id, clear);
		return new ResponseEntity<>(addClear, HttpStatus.OK);
	}

	@RequestMapping(value = "get-clearances/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Clearance>> getAllClearances(@PathVariable("id") Long id) {

		return clearServ.getAllClearances(id);

	}
	@RequestMapping(value = "delete-clearance/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<String> deleteClearance(@PathVariable("id") Long id) {
		String msg = "";
		
		try {
			clearRepo.deleteById(id);
			msg = "Clearance deleted";
			return new ResponseEntity<>(msg, HttpStatus.OK);
			
		} catch (Exception e) {
			
			msg = "Error in deleting Clearance";
			return new ResponseEntity<>(msg, HttpStatus.BAD_REQUEST);
		}

	}
}
