package Interfaces.Aufgabe01;

public class Auto extends Fahrzeug implements Fahrbar, Schwimmfähig{
    @Override
    public void fahren() {
        System.out.println(this.getClass().getSimpleName() + " kann fahren");
    }

    @Override
    public void schwimmen() {
        System.out.println(this.getClass().getSimpleName() + " kann schwimmen");

    }
}
