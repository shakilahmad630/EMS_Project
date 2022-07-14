package com.jpa.text.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.jpa.text.entity.Employee;


public interface EmpRepo extends JpaRepository <Employee, Integer>{

}
