package Java_8_Features;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		interfaceMethodRefe myinterfaceMethodRefe_obj = new interfaceMethodRefe();
		
	   ///Using (instance) Method reference 
		Thread thread = new Thread(myinterfaceMethodRefe_obj::add);
		Thread thread1 = new Thread(myinterfaceMethodRefe_obj::substract);
		thread.start();
		thread1.start();
		
		//using (Static) Method reference
		Thread thread2 = new Thread(interfaceMethodRefe::multiplication);
		thread2.start();
		//System.out.println();
	}

}
