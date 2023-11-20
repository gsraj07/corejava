package oopsdemo3;

import static java.lang.System.*;
import com.ey.training.microsoft.*;
import com.ey.training.oracle.*;

// demonstrate use of packages
public class SoftwareList {

	public static void main(String[] args) {
		
		OperatingSystem os1=new OperatingSystem();
		os1.listSoftware();
		out.println("****************************");
		Database d1=new Database();
		d1.printSoftware();

	}

}
