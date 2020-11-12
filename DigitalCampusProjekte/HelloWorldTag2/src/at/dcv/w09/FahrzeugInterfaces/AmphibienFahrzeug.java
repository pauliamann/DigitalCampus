package at.dcv.w09.FahrzeugInterfaces;


import at.dcv.w09.FahrzeugInterfaces.behaviour.CanDriveBehaviour;
import at.dcv.w09.FahrzeugInterfaces.behaviour.CanSwimBehaviour;

public class AmphibienFahrzeug extends Fahrzeug {
    public AmphibienFahrzeug(){
        swimBehaviour=new CanSwimBehaviour();
        driveBehaviour=new CanDriveBehaviour();
    }
}
