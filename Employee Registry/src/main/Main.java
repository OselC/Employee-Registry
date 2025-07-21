package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<Employee> vecEmployee = new ArrayList<>();

	void AddEmployee() {
		String name = "";
		int age = 0;
		String role = "";
		String type = "";
		
		while(name.length() <= 3) {
			System.out.print("Input employee name [must be more than 3 characters]: ");
			name = scan.nextLine();
		}
		
		while(age < 18) {
			System.out.print("Input age [must be >= 18]: ");
			age = scan.nextInt(); scan.nextLine();
		}
		
		while(!role.equalsIgnoreCase("Assistant") && !role.equalsIgnoreCase("Programmer")) {
			System.out.print("Input Employee role[Assistant|Programmer]: ");
			role = scan.nextLine();
		}
		
		while(!type.equalsIgnoreCase("PartTime") && !type.equalsIgnoreCase("FullTime")) {
			System.out.print("Input Employee role[PartTime|FullTime]: ");
			type = scan.nextLine();
		}
		
		if(type.equalsIgnoreCase("PartTime")) {
			int payperhour;
			int hourperweek;
			
			System.out.print("Input pay per hour: ");
			payperhour = scan.nextInt(); scan.nextLine();
			
			System.out.print("Input hour per week: ");
			hourperweek = scan.nextInt(); scan.nextLine();
			
			vecEmployee.add(new PartTime(name, role, age, payperhour, hourperweek));
		}
		
		else{
			int salary = 0;;
			
			System.out.print("Input base salary: ");
			salary = scan.nextInt(); scan.nextLine();
			
			vecEmployee.add(new FullTime(name, role, age, salary));
		}
		
		System.out.println("Insert Successfull");
		System.out.println("Press Enter to continue...");
		scan.nextLine();
	}
	
	void ViewEmployee() {
		int i = 1;
		
		for(Employee employee : vecEmployee) {
			System.out.println("Employee no. " + i);
			employee.print();
			i++;
		}
		
		System.out.println("Press ENTER to continue...");
		scan.nextLine();
	}
	
	void Resign() {
		if(vecEmployee.size() < 1) {
			System.out.println("The list is empty");
			System.out.println("Press ENTER to continue...");
			scan.nextLine();
			return;
		}
		
		ViewEmployee();
		
		int choice = 0;
		while(choice < 1 || choice > vecEmployee.size()) {
			System.out.print("Choose Employee No: ");
			choice = scan.nextInt(); scan.nextLine();
		}
		
		choice--;
		
		if(vecEmployee.get(choice).getActive().equals("resigned")) {
			System.out.println("This employee is already resigned");
			System.out.println("Press ENTER to continue...");
			scan.nextLine();
			return;
		}
		else {
			vecEmployee.get(choice).setActive("resigned");
			System.out.println(vecEmployee.get(choice).getName() + "is Retiring...");
			System.out.println("Employee resignation completed!");
		}
		
		System.out.println("Resignation Completed!");
		System.out.println("Press ENTER to continue...");
		scan.nextLine();
	}
	
	public Main() {
		int choice = 0;
		
		do{
			System.out.println("ABC EMPLOYEE DATA");
			System.out.println("=================");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Resign");
			System.out.println("4. Exit");
			System.out.print("Choice: ");
			choice = scan.nextInt(); scan.nextLine();
			
			switch(choice) {
			case 1:
				AddEmployee();
				break;
			
			case 2:
				ViewEmployee();
				break;
				
			case 3:
				Resign();
				break;
				
			}
		}while(choice != 4);
		
		System.out.println("Have a nice day...");
			
	}

	public static void main(String[] args) {
		new Main();
	}

}
