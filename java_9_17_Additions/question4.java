package java_9_17_Additions;

import java.util.stream.IntStream;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream
        .iterate(0,i->i<=10,i->i+3)
        .forEach(System.out::println);
	}

}
