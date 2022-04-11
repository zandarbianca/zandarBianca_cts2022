package main;

import observer.Calator;
import observer.ICalator;
import observer.MijlocTransport;

public class Program {
    public static void main(String[] args) {

        MijlocTransport mijlocTransport = new MijlocTransport(137);

        ICalator calator1 = new Calator("Ionel");
        ICalator calator2 = new Calator("Gigel");
        ICalator calator3 = new Calator("Marcel");

        mijlocTransport.adaugaCalatori(calator1);
        mijlocTransport.adaugaCalatori(calator2);

        mijlocTransport.trimiteMesajPlecareCapatLinie();
        System.out.println();
        mijlocTransport.stergeCalatori(calator2);

        mijlocTransport.adaugaCalatori(calator3);

        mijlocTransport.trimiteMesajPlecareCapatLinie();

    }
}
