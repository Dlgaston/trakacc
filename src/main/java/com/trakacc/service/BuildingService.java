package com.trakacc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trakacc.entity.Building;
import com.trakacc.entity.FacilityPost;
import com.trakacc.repo.AddressRepo;
import com.trakacc.repo.BuildingRepo;
import com.trakacc.repo.FacPostRepo;

@Service
public class BuildingService {

	
	@Autowired
	BuildingRepo buildRepo;
	@Autowired
	FacPostRepo postRepo;
	@Autowired
	AddressRepo addressrepo;
	
	public Building getBuilding(Long id) {
		Optional<Building> building = buildRepo.findById(id);
		
		if(building.isPresent()) {
			Building foundBuilding = building.get();
			return foundBuilding;
		} 
		return null;
	}
	
	public Building addPost(Long buildId, FacilityPost post) {
		Building building = getBuilding(buildId);
		FacilityPost newPost = post;
		postRepo.save(post);
		building.getPosts().add(newPost);
		buildRepo.save(building);
		
		return building;
	}

}
