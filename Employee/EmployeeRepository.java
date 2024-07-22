package com.diya.Employee_SpringBoot_JPA.Employee;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository <Employee,Integer>{
}