package com.revature.main;

import java.io.IOException;

public class ExceptionDriver {
	public static void main(String[] args) {
		
		System.out.println("Starting fine");
		
		Object o = null;
		getClassExample(o);		
		System.out.println("Ending Fine");
	}
	
	private static void getClassExample(Object o) {
		/*if (o != null) {
			o.getClass();
		}*/
		
		try {
			// risky code goes here
			o.getClass();
		} catch (Exception e) {
			System.out.println("Object is null");
			o = new Object();
			e.printStackTrace();
			throw new RuntimeException();
		} finally {
			System.out.println("Hello");
			
		}
	}
	
	// Don't return inside the finally block.
	
	private static void throwCheckedException() throws Exception, IOException, Error, Throwable {
		
	}
	
}
