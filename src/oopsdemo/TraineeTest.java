package oopsdemo;

public class TraineeTest {

	public static void main(String[] args) {
		// Invokes parameterized constructor
		Trainee t1=new Trainee(111,"James Gosling","Java",7000);
		t1.display();
		
		// Invokes parameterized constructor
		Trainee t2=new Trainee(222,"Gavin King","Hibernate",8000);
		t2.display();
		
		// Invokes Implicit constructor
		Trainee t3=new Trainee();
		t3.display();

	}

}
