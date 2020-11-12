package at.dcv.w09.FahrzeugInterfaces;


import at.dcv.w09.FahrzeugInterfaces.behaviour.CanFlyBehaviour;

public class Flugzeug extends Fahrzeug {
    public Flugzeug() {
        flyBehaviour = new CanFlyBehaviour();
    }
}
