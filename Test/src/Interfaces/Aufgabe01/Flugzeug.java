package Interfaces.Aufgabe01;

public class Flugzeug extends Fahrzeug implements Flugfähig, Fahrbar{
    @Override
    public void fahren() {
        System.out.println(this.getClass().getSimpleName() + " kann fahren");

    }

    @Override
    public void fliegen() {
        System.out.println(this.getClass().getSimpleName() + " kann fliegen");

    }
}
