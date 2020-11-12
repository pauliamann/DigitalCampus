package at.dcv.w09.FahrzeugInterfaces;


import at.dcv.w09.FahrzeugInterfaces.behaviour.CanDriveBehaviour;

public class Auto extends Fahrzeug {
    public Auto() {
        driveBehaviour = new CanDriveBehaviour();
    }
}
