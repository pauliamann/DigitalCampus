package
        at.dcv.w09.FahrzeugInterfaces.behaviour;

public class CanNotSwimBehaviour implements SwimBehaviour {
    @Override
    public void schwimmen() {
        System.out.println("Kann nicht schwimmen");
    }
}
