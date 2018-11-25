package com.cog.Garage;

public class Van extends Vehicle {
	private int wheels;
	
	
	Van(int wheels, String colour, String make,String type, int vehicleID) {
		super(colour, make, type, vehicleID);
		this.wheels = wheels;
	}
	
	public String toString() {
		return wheels + " " + getColour() + " " + getMake() + " " + getType();
		}
	
	public int getReverse() {
		return wheels;
	}
	public void setReverse(String reverse) {
		this.wheels = wheels;
	}	
}
	

