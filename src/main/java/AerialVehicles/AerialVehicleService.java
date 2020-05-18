package AerialVehicles;

import Entities.Coordinates;

public interface AerialVehicleService {
    void flyTo(Coordinates coordinates);
    void land();
    void check();
    void repair();
}
