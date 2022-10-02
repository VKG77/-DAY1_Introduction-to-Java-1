package Java_8_Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Collect all  even numbers from a list using stream
       List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12);
       numbers.stream()
       .filter(val -> val%2==0)
       .forEach(System.out::println);
       //
       List<Employee> employeeList = new ArrayList<Employee>();
       
       employeeList.add(new Employee("Vivek", "Gupta", 5000l, "Delhi"));
       employeeList.add(new Employee("Vivek", "Raj", 4003l, "WestBengal"));
       employeeList.add(new Employee("Ravi", "Sinha", 3000l, "MP"));
       employeeList.add(new Employee("Shipra", "yadav", 1000l, "UP"));
       employeeList.add(new Employee("Vikahsh", "Rai", 50000l, "Delhi"));
       employeeList.add(new Employee("Alka", "Singh", 502l, "Bihar"));
       employeeList.add(new Employee("Vikash", "Yadav", 2000l, "Delhi"));
       employeeList.add(new Employee("Parvesh", "singh", 205l, "Kolkata"));
       employeeList.add(new Employee("Dipak", "Singh", 1502l, "Delhi"));
      
       //
      // Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
       employeeList.stream()
       .filter(e -> e.getSalary() < 5000 && e.getCity()=="Delhi")
       .map(Employee::getFirstName)
       .forEach(System.out::println);
//       
	}
	
	
	

}
