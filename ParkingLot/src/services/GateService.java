package services;

import models.Gate;
import Repository.GateRepository;


public class GateService {
    private static GateRepository gateRepository;

    // Constructor to inject the repository
    public GateService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    // Method to get gate by ID
    public static Gate getGate(Long gateId){
        // Use the gate repository to retrieve the gate by ID
        return gateRepository.findById(gateId);
    }

}
