package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empser;
	@PostMapping(value="/add")
	public String addDetail(@RequestBody Employee e) {
		return empser.addDetail(e);	
	}
	@PostMapping(value="/listadd")
	public String addListDetail(@RequestBody List<Employee> e) {
		return empser.addListDetail(e);
	}
	@GetMapping(value="/getlist")
		public List<Employee> getlist(){
		return empser.getlist();
	}
	@GetMapping(value="/getEmp/{id}")
	public Employee getEmp(@PathVariable int id) {
		return empser.getEmp(id);
	}
	@GetMapping(value="/deleteEmp/{id}")
	public String deleteEmp(@PathVariable int id) {
		return empser.deleteEmp(id);
	}
	@DeleteMapping(value="/deleteallEmp")
	public String deleteallEmp() {
		return empser.deleteallEmp();
	}
	@GetMapping(value="/getFemale")
		public List<Employee> getFemale(){
		return empser.getFemale();
	}
	@PostMapping(value="/vote")
	public String addvote(@RequestBody Employee e) {
		return empser.addvote(e);	
	}
	

}
