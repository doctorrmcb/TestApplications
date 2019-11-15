package com.revature.main;
// Packages are used to help structure code to help us understand what we're doing.
// Use them to group similar use cases.

import com.revature.pojos.Circle;
// Instead of using import you can call classes using full statement. I.e. new com.revature.pojos.Circle();

public class ExampleDriver {
	public static void main(String args[]) {
		Circle circle = new Circle();
		
		circle.setColor("Red");
		
		System.out.println("Color: " + circle.getColor());
		
		circle.setDiameter(25.5);
		circle.setRadius(25.5);
		
		System.out.println("Diameter: " + circle.getDiameter());
		System.out.println("Radius: " + circle.getRadius());
		
		short s = 3000;
		
		short s2 = 4;
		
		// if doing arithmetic it defaults to int or long (only long if using a long value).
		// if using float then it defaults to double. 
		s = (short) (s + s2);
		
		// f or F must be added because it defaults to double otherwise.
		float f = 1.1f;
	}
}
