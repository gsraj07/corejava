package iodemo;

import java.io.*;

// Reader Class is used to read textual data from a file
public class ReaderExample {

	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("c:/demo/data.txt"); // upcasting
			int data=reader.read();// returns unicode value of character
			
			while(data != -1) {  //-1 when stream ends
				System.out.print((char) data);
				data=reader.read(); 
			}
			reader.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
