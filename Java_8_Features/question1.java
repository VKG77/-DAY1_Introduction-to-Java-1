package Java_8_Features;

import java.util.Scanner;

@FunctionalInterface
interface Greater{
	public boolean greater(int a,int b);
}
interface Increament{
	public int increament(int a);
}

interface Concatination{
	public String concat(String a,String B);
}
interface UpperCase{
	public String upperCase(String a);
}

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		Greater g1 = (int a,int b)->{
			if(a>b) {
				return true;
			}else {
				return false;
			}
		};
		
		System.out.println(g1.greater(n1, n2));
		
		Increament incr = (int a)->{
			a+=1;
			return a;
		};
		System.out.println(incr.increament(n1));
		
		String s1="Vivek Kumar";
		String s2="Gupta";
		Concatination concat1 = (String str1,String str2)->{
			return "after Concatination - "+str1+" "+str2;
			
		};
		System.out.println(concat1.concat(s1, s2));
		
		String lowerCase = "vivek";
		UpperCase up=(String str1)->{
			return lowerCase.toUpperCase();
		};
		System.out.println("Uppercase - "+up.upperCase(lowerCase));
		
		
	}

}
