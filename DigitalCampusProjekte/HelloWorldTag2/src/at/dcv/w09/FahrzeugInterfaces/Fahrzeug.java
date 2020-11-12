package at.dcv.w09.FahrzeugInterfaces;

import at.dcv.w09.FahrzeugInterfaces.behaviour.*;

public abstract class Fahrzeug {
    protected DriveBehaviour driveBehaviour = new CanNotDriveBehaviour();
    protected SwimBehaviour swimBehaviour = new CanNotSwimBehaviour();
    protected FlyBehaviour flyBehaviour = new CanNotFlyBehaviour();

    public void fahren() {
        driveBehaviour.fahren();
    }

    public void schwimmen() {
        swimBehaviour.schwimmen();
    }

    public void fliegen() {
        flyBehaviour.fliegen();
    }
}
