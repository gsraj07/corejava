package iodemo;

import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		
		try {
			//Create Writer object in append mode - TRUE
			FileWriter writer=new FileWriter("c:/demo/names.txt",true);
			
			// Improves efficiency while writing data to file
			BufferedWriter bwr=new BufferedWriter(writer);
			
			bwr.write("\nMAx");
			bwr.write("\nGosling");
			bwr.write("\nManu");
			System.out.println("Data Written Successfully");
			bwr.close();
		}
		
		catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
