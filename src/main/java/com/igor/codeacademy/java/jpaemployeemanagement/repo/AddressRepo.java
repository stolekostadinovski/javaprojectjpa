package com.igor.codeacademy.java.jpaemployeemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor.codeacademy.java.jpaemployeemanagement.model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {
  
}
