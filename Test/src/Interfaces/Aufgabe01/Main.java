package Interfaces.Aufgabe01;

public class Main {
    public static void main(String[] args) {
        new Auto();
        new Flugzeug();
        new Boot();

        for(Fahrzeug f : Flugzeug.fahrzeugeListe) {
            if (f instanceof Auto) {
                ((Auto) f).fahren();
                ((Auto) f).schwimmen();
            }
            if (f instanceof Boot) {
                ((Boot) f).schwimmen();
            }
            if (f instanceof Flugzeug) {
                ((Flugzeug) f).fahren();
                ((Flugzeug) f).fliegen();
            }
        }
    }
}
