package iodemo;

import java.io.*;

// Read/ Write Byte Streams - InputStream/ OutputStream
public class OutputStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos=new FileOutputStream("c:/demo/data1.txt");
			String text="Its a Sunny Day";
			
			byte[] myBytes=text.getBytes();
			
			fos.write(myBytes);
			System.out.println("Data Written to Binary File");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
