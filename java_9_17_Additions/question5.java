package java_9_17_Additions;

import java.util.stream.IntStream;

public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  IntStream
          .rangeClosed(1,10)
          .filter(e->e>10)
          .findFirst()
          .ifPresentOrElse(
                  (e)-> System.out.println("The value is::"+e),
                  ()-> System.out.println("Value does not exists")
          );
  IntStream
          .rangeClosed(1,10)
          .filter(e->e>50)
          .findFirst().orElseThrow();
	}

}
