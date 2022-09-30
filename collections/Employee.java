package collections;

public class Employee {

	private String name;
	private double age;
	private double salary;

	public Employee(String name, double age, double salary) {
	this.name = name;
	this.age = age;
	this.salary = salary;
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public double getAge() {
	return age;
	}

	public void setAge(double age) {
	this.age = age;
	}

	public double getSalary() {
	return salary;
	}

	public void setSalary(double salary) {
	this.salary = salary;
	}
}
