package at.dcv.w09.FahrzeugInterfaces;


import at.dcv.w09.FahrzeugInterfaces.behaviour.CanDriveBehaviour;

public class Motorrad extends Fahrzeug {
    public Motorrad() {
        driveBehaviour=new CanDriveBehaviour();
    }
}
