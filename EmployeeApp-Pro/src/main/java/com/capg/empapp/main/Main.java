package com.capg.empapp.main;

import java.util.Scanner;

import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.service.EmployeeServiceImpl;
import com.capg.empapp.service.IEmployeeService;

public class Main {
	

	IEmployeeService empService = new EmployeeServiceImpl();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. add employee ");
			System.out.println("2. Display All Employee ");
			System.out.println("3. Display Employee based on salary");
			System.out.println("4. Display Employee By Salary Range  ");
			System.out.println("5. Display Employee based on Exp  ");
			System.out.println("6. Display Employee By Exp Range");
			System.out.println("7. Edit Salary by Employee ID ");
			System.out.println("8. Edit Exp by Employee ID ");
			
			System.out.println("0. EXIT");
			System.out.println("Enter Option");
			int option = Integer.parseInt(sc.nextLine());
			switch(option)
			{
			
			case 1:
				
				System.out.println("Enter Employee Id ");
				int empId = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Salary ");
				int empSalary = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Exp ");
				int empExp = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Name ");
				String name = sc.nextLine();
				
				
				Employee e = new Employee(empId, name, empExp,empSalary );
				
				try
				{
					boolean isInserted = app.empService.addEmployee(e);
					if(isInserted)
					{
						System.out.println(" Employee Added !!!");
					}
					else
					{
						 throw new Exception("Cannot added Employee ...");
					}
				}
				catch(Exception ex)
				{
					System.out.println(" Contact to Customer Care ... "+ex); // raise the exception
				}
				
				break;
				
			case 2:
				
				Employee arr[] = app.empService.getAllEmployees();
				int count = EmployeeDB.count;  // not the code
				System.out.println("  --->>  count in main "+count);
				for (int i = 0; i < count; i++) {
					System.out.println(arr[i]);
					System.out.println(" ========================================================");
				}
				break;
			
			case 3:
				System.out.println("Enter Employee Salary ");
				int empSal = Integer.parseInt(sc.nextLine());
				int countS = EmployeeDB.count;
				System.out.println("count value:"+countS);
				Employee salarys[]=app.empService.getEmployeeBySalary(empSal);
				System.out.println("The Employees with salary of "+empSal);
				for (int i = 0; i < countS; i++) {
				System.out.println(salarys[i]);
				}
				break;
				
			case 4:
				System.out.println("Enter Employee Salary Min");
				int empSalarymin = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Employee Salary Max");
				int empSalarymax = Integer.parseInt(sc.nextLine());

				int countSR = EmployeeDB.count;
				Employee salarysRange[]=app.empService.getEmployeeBySalaryRange(empSalarymin, empSalarymax);
				System.out.println("The Employees with in  salary Range  of"+empSalarymin+" to "+empSalarymax);
				for (int i = 0; i < countSR; i++) {
				System.out.println(salarysRange[i]);
				}
				break;
				
			case 5:
				System.out.println("Enter Employee Exp ");
				int empExp1 = Integer.parseInt(sc.nextLine());
				int countR = EmployeeDB.count;
				System.out.println("count value:"+countR);
				Employee exps[]=app.empService.getEmployeeByExp(empExp1);
				System.out.println("The Employees with exp of "+empExp1);
				for (int i = 0; i < countR; i++) {
				System.out.println(exps[i]);
				}
				break;
				
			case 6:
				System.out.println("Enter Employee Exp Min");
				int empExpmin = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Employee Exp Max");
				int empExpmax = Integer.parseInt(sc.nextLine());

				int countRS = EmployeeDB.count;
				Employee expsRange[]=app.empService.getEmployeeByExpRange(empExpmin, empExpmax);
				System.out.println("The Employees with in  exp Range  of"+empExpmin+" to "+empExpmax);
				for (int i = 0; i < countRS; i++) {
				System.out.println(expsRange[i]);
				}
				break;
				
			case 7:
				System.out.println("Enter Employee Id ");
				int empIdToSearch = Integer.parseInt(sc.nextLine());

				System.out.println("Enter Employee Salary ");
				int empNewSalary = Integer.parseInt(sc.nextLine());
                
				try
				{
				boolean isChanged = app.empService.editSalaryByEmployeeId(empIdToSearch,empNewSalary);
				if(isChanged)
				{
				System.out.println(" Employee Details Updated !!!");
				}
				else
				{
				throw new Exception("Cannot Find Employee ID...");
				}
				}
				catch(Exception ex)
				{
				System.out.println(" Contact to Customer Care ... "+ex); // raise the exception
				}
				break;
			
			case 8:
				System.out.println("Enter Employee Id ");
				int empIdSearch = Integer.parseInt(sc.nextLine());

				System.out.println("Enter Employee Exp ");
				int empNewExp = Integer.parseInt(sc.nextLine());

                try
				{
				boolean isChanged = app.empService.editExpByEmployeeId(empIdSearch,empNewExp);
				if(isChanged)
				{
				System.out.println(" Employee Details Updated !!!");
				}
				else
				{
				throw new Exception("Cannot Find Employee ID...");
				}
				}
				catch(Exception ex)
				{
				System.out.println(" Contact to Customer Care ... "+ex); // raise the exception
				}
				break;
				
			case 0:
				System.exit(0);
			
			
			}//end switch
			
		}// end while
		
		
	}
	}//end main
	
	


