package at.dcv.w09.FahrzeugInterfaces;


import at.dcv.w09.FahrzeugInterfaces.behaviour.CanSwimBehaviour;

public class Boot extends Fahrzeug {
    public Boot() {
        swimBehaviour = new CanSwimBehaviour();
    }
}
