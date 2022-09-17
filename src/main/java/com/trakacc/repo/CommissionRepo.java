package com.trakacc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trakacc.entity.Commission;

@Repository
public interface CommissionRepo extends JpaRepository<Commission, Long> {

}
