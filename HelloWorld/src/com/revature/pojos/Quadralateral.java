package com.revature.pojos;

public class Quadralateral {
	
	public static final int NUMBER_OF_SIDES = 4;
	
	private int[] sideLengths;
	
	private double[] angles;
	
	public int[] getSideLengths() {
		return this.sideLengths;
	}
	
	public void setSideLengths(int[] sideLengths) {
		this.sideLengths = sideLengths;
	}
	
	public double[] getAngles() {
		return this.angles;
	}
	
	public void setAngles(double[] angles) {
		this.angles = angles;
	}
	
	
	// Constructors
	// First line of every constructor must be super or this.
	public Quadralateral(int[] sideLengths, double[] angles) {
		// Default constructor only has super(); in it.
		// Constructor calls super implicitly if this or super is not included.
		super();
		setSideLengths(sideLengths);
		setAngles(angles);
	}
	
	public Quadralateral() {
		// Calls the other constructor.
		this(new int[] {1,1,1,1}, new double[] {45.0,45.0,45.0,45.0});
	}
	
}
