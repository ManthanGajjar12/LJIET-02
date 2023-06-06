/*
 * @author :- Manthan Gajjar
 * DOC:-6th June 2023
 * OBJ:- WAP create 5 employeeobject for an employee class and show the count of no of employees
 * */

package ArrayofObjects;

import java.util.Scanner;

public class Employee {
	String emp_name,emp_dept;
	int emp_id;
	private static int count=0;
	Scanner sc =new Scanner(System.in);
	public void setDetails() {
		System.out.println("Enter Employee's ID :");
		emp_id=sc.nextInt();
		System.out.println("Enter Employee's Name :");
		emp_name=sc.next();
		System.out.println("Enter Employee's Department :");
		emp_dept=sc.next();
		count++;
	}//end of setDetails
	
	public void show() {
		System.out.printf("Emp_id : %d \n Emp_name : %s \n Emp_dept : %s \n\n",emp_id,emp_name,emp_dept);
	}//end of show
	
	public static void main(String[] args) {
		Employee e[] =new Employee[5];
		for(int i=0;i<2;i++)
		{
			e[i]=new Employee();
			e[i].setDetails();
		}
		
		for(int i=0;i<2;i++)
		{
			e[i].show();
		}
		System.out.println("No. of Employees : " +Employee.count);
		
		
	}//end of main
}//end of Employee Class
