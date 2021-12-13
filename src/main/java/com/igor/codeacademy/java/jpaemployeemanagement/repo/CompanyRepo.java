package com.igor.codeacademy.java.jpaemployeemanagement.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.igor.codeacademy.java.jpaemployeemanagement.model.Company;

@Repository
public interface CompanyRepo extends CrudRepository<Company, Integer>{

}
