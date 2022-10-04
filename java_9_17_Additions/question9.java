package java_9_17_Additions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list = new ArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);

	        list.stream()
	                .filter(e->e>1)
	                .collect(Collectors.toUnmodifiableList()).add(4);
	}

}
