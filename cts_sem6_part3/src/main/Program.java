package main;

import clase.Autobuz;
import clase.AutobuzDeNoapte;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(5,434);
//        autobuz.opresteInStatie();
//        autobuz.setNrCalatori(0);
//        autobuz.opresteInStatie();

        AutobuzDeNoapte autobuzDeNoapte = new AutobuzDeNoapte(autobuz);
        autobuzDeNoapte.setNrCalatori(2);
        autobuzDeNoapte.opresteInStatie();

        autobuzDeNoapte.setNrCalatori(0);
        autobuzDeNoapte.opresteInStatie();
    }
}
