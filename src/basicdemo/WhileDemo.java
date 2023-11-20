package basicdemo;
/*
 * Program to display ur name 10 times
 */
public class WhileDemo {

	public static void main(String[] args) {
		int i=1; // Loop initialization
		
		while(i<=10) { // set a condition
			System.out.println( i+" - James Gosling");
			
			i=i+1; // Increment Loop
		}
		
		System.out.println("****** Reverse Loop ***********");
		
		int j=10;
		while(j>=1) {
			System.out.println(j);
			j=j-1; // Loop decrement
		}
	}

}
