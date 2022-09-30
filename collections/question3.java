package collections;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack s = new MyStack();
		s.push(3);
		s.push(5);
		s.getMin();
		s.push(2);
		
		s.push(1);
		s.getMin();
		s.pop();
		s.getMin();
		s.pop();
		s.peek();
	}

}
