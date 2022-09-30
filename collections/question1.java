package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Float> list = new ArrayList<>();
		list.add(1.2f);
		list.add(1.3f);
		list.add(1.4f);
		list.add(1.5f);
		list.add(1.6f);
		Iterator<Float> it = list.iterator();
		double sum = 0;
		while(it.hasNext()) {
			sum+=it.next();
		}
		System.out.println(sum);

	}

}
