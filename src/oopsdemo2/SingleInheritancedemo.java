package oopsdemo2;

public class SingleInheritancedemo {

	public static void main(String[] args) {
		
		Developer d1=new Developer(101,"James Gosling", "JDBC");
		Developer d2=new Developer(201,"Rod Jhonson", "Spring FW");
		
		d1.display(); // child class obj invokes parent class method - Inheritance
		d1.print();
		
		d2.display();
		d2.print();

	}

}
