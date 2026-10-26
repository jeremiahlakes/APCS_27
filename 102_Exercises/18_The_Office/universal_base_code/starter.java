/*
 *	Author:Jeremiah Lakes
 *  Date:October 21, 2026
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	String setName;
	int setEmployeeId;
	String employeeToString;
	double setSalary;
	

	public static void main(String args[]) {
		Employee dwight = new Employee("Dwight Schrute", 1987, "Assistant to the Regional Manager");
		dwight.setName("Dwight Schrute");
		dwight.setEmployeeId(1987);
		dwight.employeeToString("Assistant to the Regional Manager");
		dwight.setSalary((int)4416.66);
		Employee jim = new Employee("Jim Halpert", 2474, "Salesman");
		jim.setName("Jim Halpert");
		jim.setEmployeeId(2474);
		jim.employeeToString("Salesman");
		jim.setSalary((int)4416.66);
		Employee pam = new Employee("Pam Beesly", 2011, "Receptionist");
		pam.setName("Pam Beesly");
		pam.setEmployeeId(2011);
		pam.employeeToString("Receptionist");
		pam.setSalary((int)2250);
		Employee Jeremiah = new Employee("Jeremiah Lakes", 2026, "Software Engineer");
		Jeremiah.setName("Jeremiah Lakes");
		Jeremiah.setEmployeeId(2026);
		Jeremiah.employeeToString("Software Engineer");
		Jeremiah.setSalary((int)4000);




}
