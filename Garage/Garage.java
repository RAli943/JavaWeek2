package Garage;

import java.util.ArrayList;
import java.util.HashMap;

public class Garage {


	private HashMap<Integer, Vehicle> vehicleList = new HashMap<Integer, Vehicle>();
	private int uniqueId = 0;

	public Garage() {

	}

	
	public void addVehicle(Vehicle v) {
		v.setId(uniqueId);
		vehicleList.put(uniqueId, v);
		uniqueId++;
	}

	public Vehicle getVehicle(int id) throws Exception {
		if (vehicleList.containsKey(id)) {
			return vehicleList.get(id);
		} else {
			throw new Exception("No vehicle exists at that index in the garage.");
		}
	}

         
	public boolean delVehicle(int id) {
		if (vehicleList.containsKey(id)) {
			
			vehicleList.remove(id);
			
			return true;
		}
		
		System.out.println("Vehicle does not exist in garage. ID: " + id);
		return false;
	}

	
	public boolean delVehicle(Vehicle v) {
		if (vehicleList.containsValue(v)) {
			
			vehicleList.values().remove(v);
			
			return true;
		}
		System.out.println("no vehicle in garage. Instance: " + v.stringify());
		return false;
	}

	
	public boolean delVehicle(String type) {

		ArrayList<Vehicle> temp = new ArrayList<Vehicle>();

		for (Vehicle v : vehicleList.values()) {
			if (v.getClass().getName().equals("garage." + type)) {
			
				temp.add(v);
			} else {
				System.out.println("Unable to delete: " + v.stringify() + ", is not a vehicle '" + type + "' class.");
				
				return false;
			}
		}

		vehicleList.values().removeAll(temp);
		
		return true;
	}

	public int calculateBill(Vehicle v) {
		if (v.getClass() == Motorbike.class) {
			return 30;
		}
		if (v.getClass() == Car.class) {
			return 40;
		}
		if (v.getClass() == Helicopter.class) {
			return 100;
		}

		return 0;
	}

	public void printInventory() throws Exception {
		if (vehicleList.size() > 0) {
			for (Vehicle v : vehicleList.values()) {
				System.out.println(v.stringify());
			}
		} else {
			throw new Exception("There are no Vehicles in the Garage.");
		}
	}

	
	public HashMap<Integer, Vehicle> getAll() {
		return vehicleList;
	}

	
	public void emptyGarage() {
		vehicleList.clear();
	}
}
