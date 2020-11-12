package at.dcv.w09.FahrzeugInterfaces;


import at.dcv.w09.FahrzeugInterfaces.behaviour.CanFlyBehaviour;
import at.dcv.w09.FahrzeugInterfaces.behaviour.CanSwimBehaviour;

public class Wasserflugzeug extends Fahrzeug {
    public Wasserflugzeug() {
        swimBehaviour = new CanSwimBehaviour();
        flyBehaviour = new CanFlyBehaviour();
    }
}
