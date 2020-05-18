package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public abstract class FighterJet extends AerialVehicle implements AerialAttackVehicle {
    int amountOfMissile;
    String missileModel;


    @Override
    public void attack() {
        System.out.println(this.pilotName + ": " + this.getClass().getSimpleName() + " Attacking, " + this.engineModel + "X" + this.amountOfMissile);
    }

    @Override
    public void check() {
        if (this.getHoursOfFlightSinceLastRepair() >= 250){
            this.repair();
        }
    }

    public int getAmountOfMissile() {
        return amountOfMissile;
    }

    public void setAmountOfMissile(int amountOfMissile) {
        this.amountOfMissile = amountOfMissile;
    }

    public String getMissileModel() {
        return missileModel;
    }

    public void setMissileModel(String missileModel) {
        this.missileModel = missileModel;
    }
}
