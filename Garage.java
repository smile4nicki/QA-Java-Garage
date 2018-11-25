package com.cog.Garage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {
	
	Car car1 = new Car(true, "red", "Suzuki", "car", 224);
	Car car2 = new Car(false, "blue", "Ford", "car", 226);
	Motorbike bike1 = new Motorbike("fast", "black", "Suzuki", "motorbike", 228);
	Van van1 = new Van(4, "white", "Ford", "van", 230);
	
	
	Garage garage = new Garage();
//Method that iterates through vehicles and calculates a bill 		
	public void calculateBill(Vehicle auto) {
		double totalBill = 0;

		for (Vehicle i : Vehicle.getVehicles()) {
			if (auto instanceof Motorbike) {
				totalBill = 400;
			}
			if (auto instanceof Car) {
				totalBill = 600;
			}
			if (auto instanceof Van) {
				totalBill = 800;
			}
			System.out.println("You pay £" + totalBill);
		}

	}

//Method that adds Vehicles
	public void addVehicle(Vehicle auto1) {
		Vehicle.getVehicles().add(auto1);
	}

//Method that removes Vehicles
	public void removeVehicleByID(int vehicleID) {
		for (Vehicle v : Vehicle.getVehicles()) {
			if (vehicleID == v.getVehicleID()) {
				Vehicle.getVehicles().remove(v);
			}
		}
	}
	
//Method that removes Vehicles by ID
	public void removeVehicleByType(String type) {

		for (Vehicle v : Vehicle.getVehicles()) {

			if ((v instanceof Car) && type.equals("Car")) {
				Vehicle.getVehicles().remove(v);
			}
			if ((v instanceof Motorbike) && type.equals("Motorbike")) {
				Vehicle.getVehicles().remove(v);
			}
			if ((v instanceof Van) && type.equals("Van")) {
				Vehicle.getVehicles().remove(v);
			}
		}
	}
	
//Method that empties garage
	public void emptyGarage() {
		Vehicle.getVehicles().clear();
	}
}
