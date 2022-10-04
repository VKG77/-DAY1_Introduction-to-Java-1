package java_9_17_Additions;

import java.util.stream.Stream;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//takeWhile operation
		Stream.of(2, 4, 6, 8, 9, 10, 12)
	    .takeWhile(n -> n % 2 == 0)
	    .forEach(System.out::println);
		
		System.out.println();
		
		//dropWhile operation
		Stream.of(2, 4, 6, 8, 9, 10, 12)
	    .dropWhile(n -> n % 2 == 0)
	    .forEach(System.out::println);
	}

}
