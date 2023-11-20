package basicdemo;

import java.util.Scanner;

/*
 * Program to find Sum and Average of 3 numbers
 * using Scanner Input to take values at run time
 */
public class SumAverage {

	public static void main(String[] args) {
		
		// Variable declarations
		int a,b,c,sum;
		float avg, marks;
		String name;
		Scanner s = new Scanner(System.in);
		
		// Input from user
		System.out.println("Enter Your Name :");
		name=s.next(); // String Input
		System.out.println("Enter ur Marks :");
		marks=s.nextFloat(); // Float input
		
		System.out.println("Enter 3 Numbers :");
		a=s.nextInt(); // Integer Input
		b=s.nextInt();
		c=s.nextInt();
		
		// Process
		sum =a+b+c;
		avg= (float)sum/3; // Type casting - Converting data type to another
		
		//OutPut
		System.out.println("The Sum of 3 Numbers is : "+sum);
		System.out.println("The Average of 3 Numbers is : "+avg);
		System.out.println("Hello "+name+" . You have scored "+marks+" Marks.");
		s.close();

	}

}
