package Java_8_Features;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable Test_Thread = ()->{
			Thread.currentThread().setName("Test_Thread");
			System.out.println(Thread.currentThread().getName()+" is running!");
		};
		Thread run = new Thread(Test_Thread);
		run.start();
	}

}
