package com.cog.Garage;

public class Motorbike extends Vehicle {
	private String speed;
	
	Motorbike(String speed, String colour, String make,String type, int vehicleID) {
		super(colour, make, type, vehicleID);
		this.speed = speed;
	}
	
	public String toString() {
		return speed + " " + getColour() + " " + getMake() + " " + getType();
		}
	
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
}
