package Missions;

        import AerialVehicles.AerialVehicle;
        import Entities.Coordinates;

        import java.util.List;


public abstract class Mission implements MissionService{
    protected Coordinates coordinates;
    protected List<AerialVehicle> participatingVehicles;

    @Override
    public void begin() {
        System.out.println("Beginning Mission!");
    }

    @Override
    public void cancel() {
        System.out.println("Abort Mission!");
    }

    @Override
    public void finish() {
        System.out.println("Finish Mission");
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }


    public List<AerialVehicle> getParticipatingVehicles() {
        return participatingVehicles;
    }

    public void setParticipatingVehicles(List<AerialVehicle> participatingVehicles) {
        this.participatingVehicles = participatingVehicles;
    }
}
