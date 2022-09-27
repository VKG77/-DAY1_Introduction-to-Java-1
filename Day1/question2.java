package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> userData = new ArrayList<>();
		 
		Scanner sc = new Scanner(System.in);
		while(true) {
          String input = sc.nextLine();
          if("XDONE".equalsIgnoreCase(input)) {
        	  break;
          }
          userData.add(input);
	}
		
		//System.out.printf("User Input Data:\n%s", String.join("\n", userData));
		System.out.println(userData);
	}
}
