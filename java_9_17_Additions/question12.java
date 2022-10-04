package java_9_17_Additions;

sealed interface Vehicle permits Car,Bike{
    int numberOfWheels();
}

record Car() implements Vehicle{
    @Override
    public int numberOfWheels() {
        return 4;
    }
}

record Bike() implements Vehicle{
    @Override
    public int numberOfWheels() {
        return 2;
    }
}

public class question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Car car = new Car();
	        System.out.println(car.numberOfWheels());

	        Bike bike = new Bike();
	        System.out.println(bike.numberOfWheels());


	}

}
