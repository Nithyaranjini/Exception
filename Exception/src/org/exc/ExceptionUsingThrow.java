package org.exc;

public class ExceptionUsingThrow {
	static void checkAge(int age) {
		if (age<18) {
			throw new ArithmeticException("Age is not enough to vote");
			
		}
		else {
			System.out.println("Age is enough to vote");
		}}
	 public static void main(String[] args) {
		checkAge(20);
	
		

	}

}
