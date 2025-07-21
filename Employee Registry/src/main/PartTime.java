package main;

public class PartTime extends Employee {
	private int payperhour;
	private int hourperweek;

	public PartTime(String name, String role, int age, int payperhour, int hourperweek) {
		super(name, role, age);
		this.payperhour = payperhour;
		this.hourperweek = hourperweek;
	}
	
	@Override
	public void print() {
		System.out.println("Part Time employee");
		System.out.println("==================");
		System.out.println("Status: " + getActive());
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Role: " + getRole());
		System.out.println("Pay per hour: " + payperhour);
		System.out.println("Hour per week: " + hourperweek);
		System.out.println("Salary: " + (payperhour * hourperweek * 4));
	}

}
