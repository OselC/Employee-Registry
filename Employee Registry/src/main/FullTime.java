package main;

public class FullTime extends Employee {
	private int salary;

	public FullTime(String name, String role, int age, int salary) {
		super(name, role, age);
		this.salary = salary;
	}

	@Override
	public void print() {
		System.out.println("Full Time employee");
		System.out.println("==================");
		System.out.println("Status: " + getActive());
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Role: " + getRole());
		System.out.println("Salary: " + salary);
	}

}
