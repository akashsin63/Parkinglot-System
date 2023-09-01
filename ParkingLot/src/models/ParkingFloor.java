package models;
import java.util.*;
public class ParkingFloor extends Base {
	private int number;
	private List<ParkingSpot> parkingSpot;
	private ParkingFloorStatus parkingFloorStatus;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public List<ParkingSpot> getParkingSpot() {
		return parkingSpot;
	}
	public void setParkingSpot(List<ParkingSpot> parkingSpot) {
		this.parkingSpot = parkingSpot;
	}
	public ParkingFloorStatus getParkingFloorStatus() {
		return parkingFloorStatus;
	}
	public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
		this.parkingFloorStatus = parkingFloorStatus;
	}
}
