package at.dcv.w09.FahrzeugInterfaces.behaviour;

public class CanDriveBehaviour implements DriveBehaviour {
    @Override
    public void fahren() {
        System.out.println("Ich kann fahren");
    }
}
