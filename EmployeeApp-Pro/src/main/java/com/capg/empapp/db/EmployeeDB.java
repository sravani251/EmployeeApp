package com.capg.empapp.db;

import com.capg.empapp.dto.Employee;

public class EmployeeDB {

public static Employee employees[]  = new Employee[100];
public static Employee sal[]=new Employee[100];
public static Employee salaryRange[]=new Employee[100];
public static Employee exp1[]=new Employee[100];
public static Employee expRange[]=new Employee[100];

	
	public static int count = 0;
	
	static {
		
		employees[count++] = 	new Employee(101, "ramesh", 8, 7000);
		employees[count++] = 	new Employee(101, "suresh", 2, 7001);
		employees[count++] = 	new Employee(101, "rakesh", 1, 7002);
		employees[count++] = 	new Employee(101, "lokesh", 5, 7003);
		
		}
		
		
	public static boolean addEmployee(Employee e)
	{
		
		employees[count++] = e;
	
		return true;
	}
	
	public static int getCount()
	{
		return count;
	}
	public static Employee[] getEmployeeBySalary(int salary) {
		int j=0;
		for(int i=0;i<count;i++) {
		if(employees[i].getSalary()==salary) {
		sal[j]=employees[i];
		j=j+1;
}
	}
       return sal;
		}
	public static Employee[] getEmployeeBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		int j=0;
		for(int i=0;i<count;i++) {
		if(employees[i].getSalary()>=salaryRangeMin && employees[i].getSalary()<=salaryRangeMax)
		{
		salaryRange[j]=employees[i];
		j=j+1;
}
		}
      return salaryRange;
	}
	public static boolean editSalaryByEmployeeID(int id,int empNewSalary) {
		for(int i=0;i<count;i++) {
		if(employees[i].getEmployeeId()==id) {
		employees[i].setSalary(empNewSalary);
		return true;
		}
		}
		return false;
}
	public static boolean editExpByEmployeeId(int id,int empNewExp) {
		for(int i=0;i<count;i++) {
		if(employees[i].getEmployeeId()==id) {
		employees[i].setExp(empNewExp);
		return true;
		}
		}
		return false;
		}


	public static Employee[] getEmployeeByExp(int exp) {
		int j=0;
		for(int i=0;i<count;i++) {
		if(employees[i].getSalary()==exp) {
		exp1[j]=employees[i];
		j+=1;


		}
		}
		return exp1;
	}
	public static Employee[] getEmployeeByExpRange(int expRangeMin,int expRangeMax) {
		int j = 0;
		for(int i=0;i<count;i++) {
		if(employees[i].getExp()>=expRangeMin && employees[i].getExp()<=expRangeMax);
		{
		expRange[j] = employees[i];
		j+=1;
		}
		}
		return expRange;
	}


	
}

