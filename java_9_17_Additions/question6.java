package java_9_17_Additions;

import java.util.Optional;

public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Optional<Integer> op = Optional.of(3456);
         System.out.println("Optional : "+op);
         System.out.println("Getting The Stream ");
         op.stream().forEach(System.out::println);
	}

}
