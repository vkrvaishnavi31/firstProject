package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	int d;
	String name;
	
	@Autowired
	EmployeeRepository empRepo;
	public String addDetail(Employee e) {
		empRepo.save(e);
		return "Successully saved";
	}
	public String addListDetail(List<Employee> e) {
		empRepo.saveAll(e);
		return "List added";
	}
	public List<Employee> getlist(){
		return empRepo.findAll();
	}
	public Employee getEmp(int id) {
		return empRepo.findById(id).get();
	}
	public String deleteEmp(int id) {
		empRepo.deleteById(id);
		return "Deleted";
	}
	public String deleteallEmp() {
		empRepo.deleteAll();
		return "Delete all !!!";
	}
	public List<Employee> getFemale(){
		return empRepo.findAll();
		
	}
	public String addvote(Employee e) {
		empRepo.save(e);
		return "Successully saved";
	}

}
