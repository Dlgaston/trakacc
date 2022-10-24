package com.trakacc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trakacc.entity.Address;

public interface AddressRepo extends JpaRepository <Address, Long>{

}
