package at.dcv.w09.FahrzeugInterfaces.behaviour;

public class CanFlyBehaviour implements FlyBehaviour {
    @Override
    public void fliegen() {
        System.out.println("Kann fliegen");
    }
}