package main;

public abstract class Employee {
	private String name, role;
	private int age;
	private String active;
	
	public Employee(String name, String role, int age) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
		this.active = "active";
	}
	
	public abstract void print();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	

}
