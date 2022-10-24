package com.trakacc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trakacc.entity.Building;

public interface BuildingRepo extends JpaRepository <Building, Long> {

}
