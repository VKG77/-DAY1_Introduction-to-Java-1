package Day1;

public class setterClass {

	private String firstName;
	private String lastName;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int i) {
		this.age = i;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	private String designation;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	void display() {
		System.out.println(firstName+" "+lastName+" "+age+" "+designation);
	}
	
 @Override
 public String toString() {
	 return this.firstName+" "+this.lastName+" "+this.age+" "+this.designation;
 }
	
	
}
