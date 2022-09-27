package Day1;

public class Employee {
	String firstname;
	String lastname;
	int age;
	String designation;
	public Employee(String firstname, String lastname, int age, String designation) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.designation = designation;
	}
	
	public Employee() {
	}	
	 void display() {
		System.out.println(firstname+" "+lastname+" "+age+" "+designation);
	}
		
//	 @Override
//	 public String toString() {
//		 return this.firstname+" "+this.lastname+" "+this.age+" "+this.designation;
//	 }
}
