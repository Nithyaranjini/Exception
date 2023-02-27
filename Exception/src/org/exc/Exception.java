package org.exc;

public class Exception {
	public static void main(String[] args) {
		   /*try{
			int[]num= {1,2,3,4,5,6};
		
		      System.out.println(num[9]);
		        }
		   catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println("This is the first output");
	        	}
		   finally {
			  System.out.println("This is the second output");
			  }*/
		
		System.out.println(1);
		try {
			String string =null;
			System.out.println(string);
		System.out.println(3/0);
		System.out.println("first statment");}
		catch (ArithmeticException e) {
			System.out.println("second statement");
		}
		finally {
			System.out.println("exceute the finally satement");
		}
		System.out.println(4);
		
	
}}
	
