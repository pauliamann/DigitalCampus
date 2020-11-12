package at.dcv.w09.FahrzeugInterfaces.behaviour;

public class CanNotFlyBehaviour implements FlyBehaviour {
    @Override
    public void fliegen() {
        System.out.println("Kann nicht fliegen");
    }
}