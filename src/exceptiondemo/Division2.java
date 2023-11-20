package exceptiondemo;

import java.util.Scanner;

public class Division2 {

	public static void main(String[] args) {
		int a, b, result;
		 Scanner input = new Scanner(System.in);
		 
		  System.out.println("Input two integers");
		  a = input.nextInt();
		  b = input.nextInt();  // enter 0
		  try { // statements to be monitored which may throw exception
			  result = a / b; 
		 
			  System.out.println("Result = " + result);  
		  }
		  catch(ArithmeticException e) //Exception thrown is handled in catch block
		  {
			  System.out.println("Divide by zero Error - Enter non-zero value");
			  System.err.println("Exception Description:"+e.getMessage());
			  System.err.println("Exception Name & description :"+e.toString());
			  e.printStackTrace(); //desc, name & line no
		  }
		  finally {
			  input.close();
		  }

	}

}
