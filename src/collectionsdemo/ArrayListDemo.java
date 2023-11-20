package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("James");
		names.add("Andy");
		names.add("Micheal");
		names.add("Jim");
		names.add("Robert");
		names.add("Robert");

		System.out.println(names);
		
		names.add("Head");
		names.add(3,"Gosling"); // add element at specified index
		names.remove(0);// delete first element
		names.set(1, "Java");// replace existing element
		
		System.out.println("Display Arraylist contents using Enhanced For Loop");
		for(String i:names) {
			System.out.println(i);
		}
		
		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(999.55);
		marks.add(500.15);
		marks.add(234.10);
		marks.add(450.20);
		marks.add(100.99);
		
		System.out.println("The length of ArrayList is : "+marks.size());
		System.out.println(" The Elemnt at position 3 is : "+marks.get(3));
		System.out.println("The Position of 100.99 is :"+marks.indexOf(100.99));
		
		// Collections is a Utility class
		Collections.sort(marks);
		System.out.println(marks);
	}

}
