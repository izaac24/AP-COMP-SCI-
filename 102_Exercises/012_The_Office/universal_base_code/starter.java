/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.raiseSalary(4);
		michael.employeeToString();
		System.out.println("michael's annual salary is " + michael.getAnnualSalary());
		
		Employee Dwight = new Employee(1987,"Dwight","Schrute",4416.66);
		Dwight.raiseSalary(999);
		Dwight.employeeToString();
		System.out.println("Dwight's annual salary is " + Dwight.getAnnualSalary());
		
		Employee Jim  = new Employee(2474,"Jim","Halpert",4416.66);
		Jim.raiseSalary(3);
		Jim.employeeToString();
		System.out.println("Jim's annual salary is " + Jim.getAnnualSalary());
		
		Employee Pam = new Employee(2011,"Pam","Beesly",2250);
		Pam.raiseSalary(24);
		Pam.employeeToString();
		System.out.println("Pam's annual salary is " + Pam.getAnnualSalary());
	}
	
}
