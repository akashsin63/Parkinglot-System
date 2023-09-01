package models;

import java.util.List;

public class ParkingSpot extends Base {
	private int number;
	private ParkingSpotStatus parkingSpotStatus;
	private ParkingFloor parkingfloor;
	private List<VehicleType> supportedVehicleType1;
	
	
	//getter and setters 
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public ParkingSpotStatus getParkingSpotStatus() {
		return parkingSpotStatus;
	}
	public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
		this.parkingSpotStatus = parkingSpotStatus;
	}
	public ParkingFloor getParkingfloor() {
		return parkingfloor;
	}
	public void setParkingfloor(ParkingFloor parkingfloor) {
		this.parkingfloor = parkingfloor;
	}
	public List<VehicleType> getSupportedVehicleType() {
		return supportedVehicleType1;
	}
	public void setSupportedVehicleType(List<VehicleType> supportedVehicleType) {
		this.supportedVehicleType1 = supportedVehicleType;
	}
	
}
