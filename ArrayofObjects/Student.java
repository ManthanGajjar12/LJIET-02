/*
 * @author :- Manthan Gajjar
 * DOC:-6th June 2023
 * OBJ:- WAP using a do while for creating an array 5 students with user define values
 * */

package ArrayofObjects;


import java.util.Scanner;

public class Student {
	String name;
	int roll_num;
	int marks;
	Scanner sc = new Scanner(System.in);
	public void setdetails()
	{
		System.out.println("Enter your name :");
		name=sc.next();
		System.out.println("Enter your Roll_num :");
		roll_num=sc.nextInt();
		System.out.println("Enter Marks :");
		marks=sc.nextInt();
		System.out.println();
	}//end of setDetails
	
	public void show()
	{
		System.out.printf("Roll number : %d \n Student name : %s \n Marks : %d \n\n",roll_num,name,marks);
	}//end of show()
	
	public static void main(String[] args) {
		Student s[] = new Student[5];
		int i=0;
		do {
			s[i]=new Student();
			s[i].setdetails();
			i++;
		} while (i<5);
		
		i=0;
		do {
			s[i].show();
			i++;
		} while (i<5);
	}//end of main 
}//end of student class
