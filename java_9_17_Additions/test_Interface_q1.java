package java_9_17_Additions;

public interface test_Interface_q1 {

public default void add(int a,int b) {
	substract(a,b);
	multi(a,b);
}
	private void substract(int a,int b) {
		System.out.println("after substraction : "+(a-b));
		
	}
	private void multi(int a,int b) {
		System.out.println("after multi : "+(a*b));
	}
}
