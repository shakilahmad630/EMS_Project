package com.jpa.text.service;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.text.entity.Employee;
import com.jpa.text.repository.EmpRepo;

//import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class EmpService {
	
	@Autowired
	
	private EmpRepo  repo;
	
	public void addEmp(Employee e)
	{
		repo.save(e);
	}

	public List<Employee> getAllEmp()
	{
		return repo.findAll();
	}
	
	public Employee getEmpById(int id)
	{
		Optional<Employee> e = repo.findById(id);
		if(e.isPresent())
		{
			return e.get();
		}
		return null;
	}
	
	public void deleteEmp(int id)
	{
		repo.deleteById(id);
	}
	
}
