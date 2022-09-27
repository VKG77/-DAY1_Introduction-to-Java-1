package Day1;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       //taking size of 2D array
       System.out.print("Please Enter the Size of ");
       int n=sc.nextInt();
       int arr[][] = new int[n][n];
       for(int i=0;i<n;i++) {
    	   for(int j=0;j<n;j++) {
    		   arr[i][j]=sc.nextInt();
    	 }
       }
       calculate_Sum(arr,n);
       
	}
	static void calculate_Sum(int arr[][],int n) {
		int sumRow = 0;
		int sumCol = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sumRow +=arr[i][j];
			}
			System.out.println("sum of "+i+" row "+sumRow);
			sumRow=0;
			
		}
		System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sumCol +=arr[j][i];
			}
			System.out.println("sum of "+i+" Coloumn "+sumCol);
			sumCol=0;
			
		}

	}

}
