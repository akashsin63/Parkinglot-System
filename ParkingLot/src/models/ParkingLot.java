package models;
import java.util.*;
public class ParkingLot extends Base {
	private List<ParkingFloor> parkingFloor;
	private List<Gate> gate;
	private ParkingLotStatus parkingLotStatus;
	
	private String name;
	private String address;
	
	public List<ParkingFloor> getParkingFloor() {
		return parkingFloor;
	}
	public void setParkingFloor(List<ParkingFloor> parkingFloor) {
		this.parkingFloor = parkingFloor;
	}
	public List<Gate> getGate() {
		return gate;
	}
	public void setGate(List<Gate> gate) {
		this.gate = gate;
	}
	public ParkingLotStatus getParkingLotStatus() {
		return parkingLotStatus;
	}
	public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
		this.parkingLotStatus = parkingLotStatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
