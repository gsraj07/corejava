package com.ey.training.oracle;

public class Database {
	
	// final methods cannot be overridden
	public final void printSoftware()
	{
		int i;
		String []arrOracle= {"Oracle","MySQL","MariaDb","Postgres"};
		for(i=0;i<3;i++) {
			System.out.println(arrOracle[i]);
		}
	}
}
