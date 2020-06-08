package Missions;


import Entities.Coordinates;

import java.rmi.server.RMIServerSocketFactory;

public abstract class Mission implements MissionService {
    private Coordinates destination;

    public Mission(Coordinates destination) {
        this.destination = destination;
    }

    public void begin() {
        System.out.println("Beginning Mission!");
    }

    public void cancel() {
        System.out.println("Abort Mission!");
    }

    public void finish() {
        System.out.println("Finish Mission!");
    }

    public Coordinates getDestination() {
        return destination;
    }
}
