package Missions;

        import AerialVehicles.AerialVehicle;
        import Entities.Commander;
        import Entities.Coordinates;
        import Entities.MissionStatus;

        import java.util.Date;
        import java.util.List;


public abstract class Mission implements MissionService{
    protected Coordinates destination;
    protected Date dueDate;
    protected List<AerialVehicle> participatingVehicles;
    protected Commander commander;
    protected MissionStatus missionStatus;

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
}
