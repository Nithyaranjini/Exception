package org.exc;

public class Employee throws EemployeNotFoundException{
	String id ="123";
	if(id.equals("123")) {
		System.out.println("employee present");}
	else {
		try {
		
		throw new EemployeNotFoundException();}
		catch (EemployeNotFoundException e) {
			System.out.println("employee absent");
			e.printStackTrace();
		}
		finally {
			System.out.println("Data base");
		}}}
		
	 public static void main(String[]args)throws EemployeNotFoundException{
	 Employee employee =new Employee();
	 employee.search();
	 
	}
	
	


