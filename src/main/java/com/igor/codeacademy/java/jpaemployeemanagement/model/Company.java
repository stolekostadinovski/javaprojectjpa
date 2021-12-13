package com.igor.codeacademy.java.jpaemployeemanagement.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Company {
  @Id
  private Integer id;
  
  private String name;
  private int numberOfEmployees;
  private int companyRating;
  
  @ManyToMany
  private Set<Employee> employees;
  @OneToMany
  private Set<Address> addresses;
  
}
