package com.igor.codeacademy.java.jpaemployeemanagement.repo;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.igor.codeacademy.java.jpaemployeemanagement.model.Employee;

@Repository
public class EmployeeRepo {

  @Autowired
  private EntityManager em;
  
  public Employee findById(Integer id) {
    return em.find(Employee.class, id);
  }
  
  @Transactional
  public Employee save(Employee employee) {
    em.persist(employee);
//    em.flush();
    employee.setName("Stojanco");
    return employee;
  }
  
}
