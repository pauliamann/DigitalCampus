package at.dcv.w09.FahrzeugInterfaces;


import at.dcv.w09.FahrzeugInterfaces.behaviour.CanFlyBehaviour;
import at.dcv.w09.FahrzeugInterfaces.behaviour.CanNotFlyBehaviour;
import at.dcv.w09.FahrzeugInterfaces.behaviour.CanSwimBehaviour;

public class StrategyMain {
    public static void main(String[] args) {
        System.out.println("---Motorrad---");
        Motorrad suzuki = new Motorrad();
        suzuki.fahren();
        suzuki.fliegen();
        suzuki.schwimmen();
        System.out.println("---Knight rider---");
        Auto knightRider = new Auto();
        knightRider.swimBehaviour = new CanSwimBehaviour();
        knightRider.fahren();
        knightRider.schwimmen();
        knightRider.fliegen();
        System.out.println("Turbo boost aktivieren");
        knightRider.flyBehaviour = new CanFlyBehaviour();
        knightRider.fliegen();
        System.out.println("Turbo boost deaktivieren");
        knightRider.flyBehaviour = new CanNotFlyBehaviour();
        knightRider.fliegen();
    }
}
