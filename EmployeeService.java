package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao empDao;
	public String addDetail(Employee e) {
		return empDao.addDetail(e);
	}
	public String addListDetail(List<Employee> e) {
		return empDao.addListDetail(e);
	}
	public List<Employee> getlist(){
		return empDao.getlist();
	}
	public Employee getEmp(int id) {
		return empDao.getEmp(id);
	}
	public String deleteEmp(int id) {	
		return empDao.deleteEmp(id);
	}
	public String deleteallEmp() {
		return empDao.deleteallEmp();
	}
	public List<Employee>getFemale(){
		return empDao.getFemale().stream().filter(a->a.getGender().equalsIgnoreCase("Female")).toList();
	}
	public String addvote(Employee e) {
		if(e.getAge()>19) {
		return empDao.addvote(e);
		}
		else {
			return "Not Eligible !!";
		}
	}
	
	

}
