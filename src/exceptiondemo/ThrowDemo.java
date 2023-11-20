package exceptiondemo;

// Program to throw exception manually
public class ThrowDemo {
 // static method- It can be invoked without Object
	public static void hello(int a) {
		if(a==0) {
			throw new  ArithmeticException("Pass Non Zero values");
		}else {
			System.out.println("Passed value is :"+a);
		}
	}
	public static void main(String[] args) {
		
		hello(100);
		hello(0);
	}

}
