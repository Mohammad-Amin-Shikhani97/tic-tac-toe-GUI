package Interfaces.Aufgabe01;

public class Boot extends Fahrzeug implements Schwimmfähig{
    @Override
    public void schwimmen() {
        System.out.println(this.getClass().getSimpleName() + " kann schwimmen");
    }
}
