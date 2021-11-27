package com.curd.apps.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curd.apps.model.Employee;
@Service

public class EmployeeService {
	private static List<Employee> employees ;
    static {
    	
    	employees = new ArrayList<>();
    	employees.add(new Employee(11, "laya", 70000, "java",LocalDate.of(2021, Month.NOVEMBER, 11)));
    	employees.add(new Employee(12, "akhila", 80000, "c",LocalDate.of(2022, Month.FEBRUARY, 12)));
    	
    	
    }
    
    public List<Employee> findAllEmployess() {
    	return employees;
    }
    public String saveEmployee(Employee emp) {
    	employees.add(emp);
    	return "employee details are saved successfully";
   
    	
    }
    public Employee findEmployeeById(int id) {
    	for(Employee emp:employees) {
    		if(emp.getId()==id) {
    			return emp;
    		}
    	}
    	return new Employee();
    
    	
    }
    
   public String updateEmployeeById(Employee emp) {
	   //check if employee is present in database or not
	   Employee emp1 = findEmployeeById(emp.getId());
	   if(emp1.getId()==0) {
		   return "userisnotfound";
		   
	   }

	   emp1.setSkillset(emp.getSkillset());
	   emp1.setName(emp.getName());
	   emp1.setSalary(emp.getSalary());
	   return "updated succesfully";
	   
   }
   public String deleteEmployeeById(int id) {
	   //checking if the given user is present or not in the database
	   Employee emp =findEmployeeById(id);
	   if(emp.getId()==0) {
		   return "userisnotfound";
		   
	   }
	   Iterator<Employee> itr = employees.iterator();
	   while (itr.hasNext()) {
		   Employee emp1 = itr.next();
		   if(emp1.getId()==id) {
			   itr.remove();
		   }
		   
	   }
	   return "employee details are deleted";
	   
	   
	   
	   
   }
   
}
