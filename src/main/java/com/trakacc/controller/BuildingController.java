package com.trakacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trakacc.entity.Address;
import com.trakacc.entity.Building;
import com.trakacc.entity.FacilityPost;
import com.trakacc.repo.AddressRepo;
import com.trakacc.repo.BuildingRepo;
import com.trakacc.repo.FacPostRepo;
import com.trakacc.service.BuildingService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BuildingController {
	
	@Autowired
	BuildingRepo buildRepo;
	@Autowired
	FacPostRepo postRepo;
	@Autowired
	AddressRepo addressrepo;
	@Autowired
	BuildingService buildServ;
	
	@RequestMapping(value = "/building-body", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Building> getBuilding(Building body){
		Building building = new Building();
		return new ResponseEntity<> (building, HttpStatus.OK);
	}
	@RequestMapping(value = "/address-body", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Address> getAddress(Address body){
		Address building = new Address();
		return new ResponseEntity<> (building, HttpStatus.OK);
	}
	@RequestMapping(value = "/post-body", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<FacilityPost> getPost(FacilityPost body){
		FacilityPost building = new FacilityPost();
		return new ResponseEntity<> (building, HttpStatus.OK);
	}
	@RequestMapping(value = "/add-building", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Building> addBuilding(@RequestBody Building body){
		postRepo.saveAll(body.getPosts());
		return new ResponseEntity<> (buildRepo.save(body), HttpStatus.OK);
	}
	@RequestMapping(value = "/add-post-building", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Building> addPostToBuilding(@RequestBody FacilityPost post, Long buildId){
		return new ResponseEntity<> (buildServ.addPost(buildId, post), HttpStatus.OK);
	}
}
