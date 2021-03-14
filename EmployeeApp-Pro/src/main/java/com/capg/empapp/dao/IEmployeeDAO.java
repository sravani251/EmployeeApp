package com.capg.empapp.dao;

import com.capg.empapp.dto.Employee;
import com.capg.empapp.exceptions.InvalidEmployeeIdException;
import com.capg.empapp.exceptions.WrongSalaryException;

public interface IEmployeeDAO {
	
	public boolean addEmployee(Employee e)throws WrongSalaryException;
	 
	 public boolean editSalaryByEmployeeId(int id,int empNewSalary)throws InvalidEmployeeIdException;
	 
	 public boolean editExpByEmployeeId(int id, int empNewExp)throws InvalidEmployeeIdException;
	 
	 public Employee[] getAllEmployees();
	 
	 public Employee[] getEmployeeBySalary(int salary);
	 
	 public Employee[] getEmployeeByExp(int exp);
	 
	 public Employee[] getEmployeeBySalaryRange(int salaryRangeMin,int salaryRangeMax);

	public Employee[] getEmployeeByExpRange(int expRangeMin, int expRangeMax);

}
 