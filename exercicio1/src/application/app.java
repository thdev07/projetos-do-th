package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class app {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
         
		Employee  Employee = new Employee();
		
		System.out.println("Name: ");
		Employee.Name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		Employee.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		Employee.tax = sc.nextDouble();
		
		System.out.println();
		
		System.out.println(Employee);
		System.out.println();
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		Employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + Employee); 
		
	}

}
