package java_9_17_Additions;

import java.util.Objects;

record Student(String name, Integer id, Integer age){
    static int counter =0;
    static void incrementCounter(){
        counter++;
    }

    Student{
        Objects.requireNonNull(name);
        incrementCounter();
    }

}

public class question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student employee1 = new Student("Vivek",1,24);
		Student employee2 = new Student("Ravi",2,14);
        System.out.println(employee1);
        System.out.println(employee1.age());
        System.out.println(employee1.id());
        System.out.println(employee1.name());
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee1.equals(employee2));
        System.out.println(Student.counter);
	}

}
