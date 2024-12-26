package Interfaces.Aufgabe0;

public class Musiker implements Gitarrenspieler, Sänger {
    @Override
    public void gitarreSpielen() {
        System.out.println("Ich spiele Gitarre");
    }
    public void singen() {
        System.out.println("Ich singe auch");
    }
}
