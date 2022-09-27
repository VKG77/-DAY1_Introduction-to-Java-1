package question3;

import java.util.Scanner;

public class menuOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("*******Menu*******");
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3. Exit.");
        System.out.println("Choose an option (1-3): ");
        int option =sc.nextInt();
      

        double radius=sc.nextDouble();
        switch(option) {
        case 1:
        	System.out.println("Please Enter radius : -");
        	System.out.println("Area of Circle : "+cal_Area(radius));
        	break;
        case 2:
        	System.out.println("Please Enter radius : -");
        	System.out.println("Circumference of a Circle : "+Circumference(radius));
        	break;
        case 3:
        	System.out.println("Exited!! ");
        	System.exit(0);
        default: 
        	System.out.println("Please choose Valid option");
        	break;
        }
       
        
        
	}
	public static double cal_Area(double r) {
		double area=3.14*r*r;
		return area;
	}
	
	public static double Circumference(double r) {
		double Circumferen= 2*3.14*r;
		return Circumferen;
	}

}
