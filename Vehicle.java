package com.cog.Garage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vehicle {
	private String colour;
	private String make;
	private String type;
	private int vehicleID;
	
	// ArrayList with all vehicles in
	private static ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	Vehicle(String colour, String make, String type, int vehicleID) {
		this.setColour(colour);
		this.setMake(make);
		this.setType (type);
		this.setVehicleID(vehicleID);
		Vehicle.getVehicles().add(this);
				
	}

	public static ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}
	
	public static void setVehicles(ArrayList<Vehicle> vehicles) {
		Vehicle.vehicles = vehicles;
	}

	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}	
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
}
