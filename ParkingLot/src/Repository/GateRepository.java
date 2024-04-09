package Repository;

import java.util.HashMap;
import models.*;


public interface GateRepository {
    Gate findById(Long gateId);
    void save(Gate gate);
}

 class InMemoryGateRepository implements GateRepository {
    // In-memory storage for gates
    private final HashMap<Long, Gate> gateMap;

    public InMemoryGateRepository() {
        this.gateMap = new HashMap<>();
    }

    @Override
    public Gate findById(Long gateId) {
        return gateMap.get(gateId);
    }

    @Override
    public void save(Gate gate) {
        gateMap.put(gate.getId(), gate);
    }
}