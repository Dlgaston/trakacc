package com.trakacc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trakacc.entity.FacilityPost;

public interface FacPostRepo extends JpaRepository<FacilityPost, Long>{

}
