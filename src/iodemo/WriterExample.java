package iodemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * Character Streams - Read/ write Textual data using Reader/Writer Classes of java.io package
 */
public class WriterExample {

	public static void main(String[] args) {
		
		String content="She Sells Sea Shells in the Sea in Mumbai";
		
		try {
			Writer w=new FileWriter("c:/demo/data.txt");
			
			w.write(content);
			System.out.println("Data Written to File");
			w.close();
		}
		catch(IOException e) {
			System.out.println("ERROR OCURRED");
			e.printStackTrace();
		}
		
	}
}
