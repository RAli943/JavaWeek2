package Garage;


public abstract class Vehicle {
	protected int vehicleDoors = 0;
	protected int vehicleSpeed = 0;
	protected String vehicleColour = "";
	
	protected int vehicleId = 0;

	public Vehicle() {
		
	}

	public String stringify() {
		return "[VehicleId: " + this.vehicleId + "] [Type: " + this.getClass().getName().replace("garage.", "") + ", Doors: " + vehicleDoors + ", Speed: " + vehicleSpeed + ", Colour: " + vehicleColour + "]";
	}

	public void setId(int id) {
		this.vehicleId = id;
	}
}