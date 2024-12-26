package Interfaces.Aufgabe01;

import java.util.ArrayList;

public abstract class Fahrzeug {
    public static final ArrayList<Fahrzeug> fahrzeugeListe = new ArrayList<Fahrzeug>();
    public Fahrzeug() {
        fahrzeugeListe.add(this);
    }
}
