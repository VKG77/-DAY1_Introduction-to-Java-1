package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee2 e1 = new Employee2(20, "Pavnesh", "trainee");
		Employee2 e2 = new Employee2(228, "Alka", "manager");
		Employee2 e3 = new Employee2(27, "Shipra", "director");
		Employee2 e4 = new Employee2(38,"Vivek","CEO");

		Map<Employee2, Integer> map = new LinkedHashMap<>();

		map.put(e1, 150);
		map.put(e2, 2000);
		map.put(e3, 3882);
		map.put(e4, 1855232);
		for (Employee2 key : map.keySet()) {
		System.out.println(key + ":" + map.get(key));
		}
	}

}
