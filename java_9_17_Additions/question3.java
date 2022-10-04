package java_9_17_Additions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
        IntStream rangeclosed = IntStream.rangeClosed(a, b);
        System.out.println(Arrays.toString(rangeclosed.toArray()));
	}

}
