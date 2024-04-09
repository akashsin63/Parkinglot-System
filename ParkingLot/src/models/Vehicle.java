package models;

public class Vehicle {
	private VehicleType vehicleType;
	private String number;
	public Vehicle(String number2, VehicleType vehicleType2) {
        //TODO Auto-generated constructor stub
    }
    public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
