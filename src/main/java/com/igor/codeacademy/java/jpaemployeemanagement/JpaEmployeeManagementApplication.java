package com.igor.codeacademy.java.jpaemployeemanagement;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

impor com.igor.codeacademy.java.jpaemployeemanagement.model.Address;
import com.igor.codeacademy.java.jpaemployeemanagement.model.Employee;
import com.igor.codeacademy.java.jpaemployeemanagement.repo.AddressRepo;
import com.igor.codeacademy.java.jpaemployeemanagement.repo.EmployeeRepo;

@SpringBootApplication
publicc class JpaEmployeeManagementApplication {

  @Autowired private AddressRepo addrRepo;
  @Autowired private EmployeeRepo emRepo;

  public static void main(String[] args) {
    SpringApplication.run(JpaEmployeeManagementApplication.class, args);
  }

  @PostConstruct
  public void doThings() {
    //	  Address address1 = 
    //	      Address.builder()
    //	             .country("MK")
    //	             .s
    Employee emp1 = Employee.builder()
        .name("Stole")
        .number(1)
        .rating(5)
        .build();
    Address address = Address.builder()
        .streetName("pero nakov")
        .country("MKD")
        .streetNumber(13)
        .build();
    Address savedAddress = addrRepo.save(address);
    emp1.setAddressce(savedAddress);
    Employee savedEmployee = emRepo.save(emp1);
    System.out.println(savedEmployee);
//    System.out.println(emRepo.getClass().getName());
//    Employee emFromDb = emRepo.findById(savedEmployee.getId());
//    System.out.println(emFromDb);
  }

}
