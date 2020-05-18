package AerialVehicles.FighterJets;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.FighterJets.FighterJet;

public class F16 extends FighterJet implements AerialBdaVehicle {
    String cameraType;

    @Override
    public void preformBda() {
        System.out.println(this.pilotName + ": " + this.getClass().getSimpleName() + " taking pictures, " + this.cameraType);
    }

    public String getCameraType() {
        return cameraType;
    }

    public void setCameraType(String cameraType) {
        this.cameraType = cameraType;
    }
}
