package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialVehicle;
import Missions.AttackMission;

public abstract class FighterJet extends AerialVehicle implements AerialAttackVehicle {
    private static final int MAX_HOURS_AFTER_REPAIR = 250;
    int amountOfMissile;
    String missileModel;

    @Override
    public void attack() {
        System.out.println(this.getPilotName() + ": " + this.getClass().getSimpleName() +
                " Attacking " + ((AttackMission) this.getMission()).getTarget() +
                this.getMissileModel() + "X" + this.getAmountOfMissile());

    }

    @Override
    public void check() {
        if (this.getHoursOfFlightSinceLastRepair() >= MAX_HOURS_AFTER_REPAIR){
            this.repair();
        }
    }

    public int getAmountOfMissile() {
        return this.amountOfMissile;
    }

    public String getMissileModel() {
        return this.missileModel;
    }
}
