package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bank {
//	private String account_Holder_Name;
//	private String account_no;
//	private String acc_type;
//	private long balance;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//writing output in to the file
		
		PrintStream fileOut = new PrintStream(new File("/home/vivek/Desktop/javaOutPut/javaNew3.txt"));
	    System.setOut(fileOut);
		System.out.println("Welcome to the INDIAN BANKING SYSTEM");
		System.out.println("*****MENU******");
		System.out.println("Please choose Bank Name using Number 1 to 3");
		System.out.println("1. BOI");
		System.out.println("2. ICICI");
		System.out.println("3. SBI");
		
//		PrintStream fileOut = new PrintStream(new File("/home/vivek/Desktop/javaOutPut/javaNew2.txt"));
//	    System.setOut(fileOut);
		
		
		System.out.println("Please Enter a No. to choose a Bank ");
		int bank_option = sc.nextInt();
		switch (bank_option) {
		case 1:
			BOI boi = new BOI();
			boi.getDetails();
			boi.printDetails();
			//boi.withdrawal();
			System.out.println("Do you want to withdrawal money from Your Account if Yes please Type 'Y' or 'N' ");
			String withdrwa_ption=sc.next();
			switch(withdrwa_ption) {
			case "Y":
				boi.withdrawal();
				break;
			case "N":
				System.out.println("Thank you for visit BOI");
				break;
				default :
					System.out.println("Please choose 'Y' OR 'N' ");
			}
			break;
		case 2:
			ICICI icici = new ICICI();
			icici.getDetails();
			icici.printDetails();
			System.out.println("Do you want to withdrawal money from Your Account if Yes please Type 'Y' or 'N' ");
			String withdrwa_ption_ICICI=sc.next();
			switch(withdrwa_ption_ICICI) {
			case "Y":
				icici.withdrawal();
				break;
			case "N":
				System.out.println("Thank you for visit ICICI");
				break;
				default :
					System.out.println("Please choose 'Y' OR 'N' ");
			}
			break;
		case 3:
			SBI sbi = new SBI();
			sbi.getDetails();
			sbi.printDetails();
			System.out.println("Do you want to withdrawal money from Your Account if Yes please Type 'Y' or 'N' ");
			String withdrwa_ption_SBI=sc.next();
			switch(withdrwa_ption_SBI) {
			case "Y":
				sbi.withdrawal();
				break;
			case "N":
				System.out.println("Thank you for visit SBI");
				break;
				default :
					System.out.println("Please choose 'Y' OR 'N' ");
			}
			break;
			default:
				System.out.println("Please choose a correct Bank Number");
		}
	
	}
	public static void log(String message) throws IOException { 
	      PrintWriter out = new PrintWriter(new FileWriter("output.txt", true), true);
	      out.write(message);
	      out.close();
	    }

}
