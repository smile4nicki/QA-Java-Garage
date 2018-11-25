package com.cog.Garage;

public class Car extends Vehicle{
	private boolean fiveDoor;
	
	Car(boolean fiveDoor, String colour, String make,String type, int vehicleID) {
		super(colour, make, type, vehicleID);
		this.fiveDoor = fiveDoor;
	}
	
	public String toString() {
		return fiveDoor + " " + getColour() + " " + getMake() + " " + getType();
		}
	
	public boolean getFiveDoor() {
		return fiveDoor;
	}
	
	public void setFiveDoor(boolean fiveDoor) {
		this.fiveDoor = fiveDoor;
	}
}

