package Java_8_Features;

interface running{
	default void run(){
		System.out.println("Running");
	}
	
}
interface walking{
	default void walk(){
		System.out.println("walking");
	}
}
public class question5 implements  running,walking{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question5 q=new question5();
		q.walk();
		q.run();
	}

}
