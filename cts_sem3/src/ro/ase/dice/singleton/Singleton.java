package ro.ase.dice.singleton;

public class Singleton {
    private String nume;
    private static Singleton instanta = null;

    private Singleton() {}

    public synchronized static Singleton getInstanta() {
        if(instanta == null){
            instanta = new Singleton();
        }
        return instanta;
    }
}
