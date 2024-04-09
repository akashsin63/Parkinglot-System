package services;

import models.Gate;
import models.Ticket;
import models.Vehicle;
import models.VehicleType;

public class TicketService {
	public VehicleService vehicleSercvice;
	private GateService gate;

	public Ticket generateTicket(String vehicleNumber, VehicleType vehicleType , Long getId) {
		//Flow
		//  1. check if vehicle is in the database
		//  2. if vehicle not found. register vehicle
		Vehicle vehicle = vehicleSercvice.getVehicle(vehicleNumber);
		if(vehicle == null){
			vehicle = vehicleSercvice.registerVehicle(vehicleNumber, vehicleType);
		}

		Gate gate  = GateService.getGate(getId);
		//  3. Assign Parking spot	
		//  4. update the parking spot
		//  5. generate parking spot
		 
		return null;
	}
}
