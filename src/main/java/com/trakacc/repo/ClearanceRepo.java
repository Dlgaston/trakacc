package com.trakacc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trakacc.entity.Clearance;

@Repository
public interface ClearanceRepo extends JpaRepository<Clearance, Long>{

}
