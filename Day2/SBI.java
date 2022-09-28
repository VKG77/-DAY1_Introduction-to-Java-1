package Day2;

import java.util.Scanner;

public class SBI extends Bank {
	private String account_Holder_Name;
	private String account_no;
	private acc_typeEnum acc_type;
	private long balance;

	private double rateofinterest = 4.7;

	private enum acc_typeEnum {
		SAVINGS, CURRENT
	}
	
	Scanner sc = new Scanner(System.in);

	public void getDetails() {
		
		System.out.println("Welcome to the State Bank Of India - SBI ");
		System.out.println("Please Enter Account Holder Name : ");
		account_Holder_Name = sc.nextLine();
		System.out.println("Please Enter Account Number : ");
		account_no = sc.nextLine();
		System.out.println("Please choose your Account type : for SAVINGS type - 1 Or 2 for CURRENT");
		int type = sc.nextInt();
		switch (type) {
		case 1:
			acc_type = acc_typeEnum.valueOf("SAVINGS");
			System.out.println("Your Acoount created as SAVINGS");
			break;
		case 2:
			acc_type = acc_typeEnum.valueOf("CURRENT");
			System.out.println("Your Acoount created as CURRENT");
			break;
		default:
			System.out.println("Please choose a valid Number to select account type");
			break;
		}
		System.out.println("Enter you amount balance for Deposit : ");
		balance = sc.nextLong();
	}

	public void printDetails() {
		System.out.println("account_Holder_Name : " + account_Holder_Name);
		System.out.println("account_no : " + account_no);
		System.out.println("acc_type : " + acc_type);
		System.out.println("balance : " + balance);
	}
	
	public void withdrawal() {
		System.out.println("Enter the amount you want to withdrawal : ");
		long amount = sc.nextInt();
		if(amount<=balance) {
			balance-=amount;
			System.out.println("balance after withdrawal  : "+balance);
		}else {
			System.out.println("your balance is less than "+amount+" Transaction Failed");
		}
}
}