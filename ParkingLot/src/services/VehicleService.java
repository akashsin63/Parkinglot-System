package services;

import Repository.VehicleRepository;
import models.Vehicle;
import models.VehicleType;

public class VehicleService {
    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle registerVehicle(String number, VehicleType vehicleType){

      return this.vehicleRepository.addVehicle(new Vehicle(number,vehicleType));
    }

    public Vehicle getVehicle(String number){
        return vehicleRepository.getVehicle(number);
    }
}
