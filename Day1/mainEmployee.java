package Day1;

public class mainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		  /// paramatrized Constructor
		Employee emp1 = new Employee("Rahul","Raj",34,"SDE");
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.firstname="Shipra";
		emp2.lastname="Kumari";
		emp2.age=22;
		emp2.designation="SDE";
		emp2.display();
		
		setterClass mysetter = new setterClass();
		mysetter.setFirstName("Vivek ");
		mysetter.setLastName("Gupta");
		mysetter.setAge(25);
		mysetter.setDesignation("SDET");
		mysetter.display();
		
		//using toString to print Object value
	 System.out.println(mysetter.toString());
	}

}
