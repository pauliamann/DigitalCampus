package at.dcv.w09.FahrzeugInterfaces.behaviour;

public class CanAllBehaviour implements DriveBehaviour, FlyBehaviour, SwimBehaviour {
    @Override
    public void fahren() {
        new CanDriveBehaviour();
    }

    @Override
    public void fliegen() {
        new CanFlyBehaviour();
    }

    @Override
    public void schwimmen() {
        new CanSwimBehaviour();
    }
}
