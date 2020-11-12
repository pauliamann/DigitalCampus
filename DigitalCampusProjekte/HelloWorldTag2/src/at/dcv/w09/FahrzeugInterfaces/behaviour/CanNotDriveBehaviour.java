package at.dcv.w09.FahrzeugInterfaces.behaviour;

public class CanNotDriveBehaviour implements DriveBehaviour {
    @Override
    public void fahren() {
        System.out.println("Ich kann nicht fahren");
    }
}
