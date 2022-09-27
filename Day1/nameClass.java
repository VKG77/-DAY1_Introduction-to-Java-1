package Day1;

public class nameClass {
	
	//declared static variable
	static String FirstName2="Ram";
	static String LastName2="Raj";
	static int age2=35;

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticblock t1 = new staticblock();
		
		//printing using static method
		printUsingStaticMethod();
		
		//printing using static variable
		printUsingStaticVarible();
	}

	//printing using static Method
	public static void printUsingStaticMethod() {
		String FirstName="Rohit";
		String LastName="Raj";
		int age=25;
		System.out.println(FirstName+" "+LastName+" "+age);
	}
	
	
	//printing using static variable
	public static void printUsingStaticVarible() {
		
		System.out.println(FirstName2+" "+LastName2+" "+age2);
	}
	
}

//printing using static Block
class staticblock{
	static {
			String FirstName="Vivek";
			String LastName="Kumar";
			int age=22;
			System.out.println(FirstName+" "+LastName+" "+age);
	}
}
