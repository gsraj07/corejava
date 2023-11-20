package exceptiondemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		String languages[]= {"C","C++","Java","Perl","Python"};
		String a=null;
		try {
			for(int i=0;i<5;i++) {
				System.out.println(languages[i]);
			}
			System.out.println(a.length());
		}
		catch(Exception ex) { // General Exception Handling
			ex.printStackTrace();
		}

	}

}
