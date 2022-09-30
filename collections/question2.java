package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				Employee employee1 = new Employee("Devendra", 51, 101.0);
				Employee employee2 = new Employee("Alka", 20, 805.0);
				Employee employee3 = new Employee("Shipra", 21, 900.0);
				Employee employee4 = new Employee("pavnesh", 22, 120.0);
				Employee employee5 = new Employee("Amit", 25, 100.0);
				List<Employee> employeeList = new ArrayList<>();
				employeeList.add(employee1);

				employeeList.add(employee2);
				employeeList.add(employee3);
				employeeList.add(employee4);
				employeeList.add(employee5);
				Collections.sort(employeeList, new Comparator<Employee>() {
				public int compare(Employee e1, Employee e2) {
				if (e1.getSalary() > e2.getSalary()) {
				return 1;
				} else if (e1.getSalary() == e2.getSalary()) {
				return 0;
				} else {
				return -1;
				}
				}
				});
				System.out.println("Employess in decreasing order of salary");
				Collections.reverse(employeeList);
				for (Employee e : employeeList) {
				System.out.println(e.getName() + " " + e.getSalary());
				}
	}

}
