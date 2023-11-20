package basicdemo;

import java.util.Scanner;
/*
 * Java program to find Area of a Circle.
 */
public class Area {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		float a,r; //variable declaration
		final float PI=3.14f; // constant declaration . constant names should be uppercase
		
		System.out.println("Enter Radius of a Circle :");
		r=s.nextFloat();
		
		a=PI*r*r;
		
		System.out.println("The Area of a circle is : "+a);
		System.out.print("The Area of a circle is : ");
		System.out.format("%.2f",a );
		s.close();
	}
}
