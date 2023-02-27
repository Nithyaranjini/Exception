package org.exc;

public class CheckedException {
	public static void main(String[] args) {
		try {
			Class.forName("org.test.CheckedException1");}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Found the exception");
		}
	
			
	}}
	  
		
	    
	  



