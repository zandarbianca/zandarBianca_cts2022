package ro.ase.dice.part1.main;

import ro.ase.dice.part1.clase.MijlocTransport;
import ro.ase.dice.part1.factory.AutobuzFactory;
import ro.ase.dice.part1.factory.Factory;
import ro.ase.dice.part1.factory.TramvaiFactory;
import ro.ase.dice.part1.factory.TroleibuzFatory;


//1. Companie de transport in comun - STB.
//
//Trebuie implementat un modul care sa creeze obiecte de tipul MijlocTransport: Autobuz, Tramvai, Troleibuz
//Modulul trebuie sa ajute la crearea de obiecte de familia de clase MijlocTransport
//Tipurile de transport sunt salvate intr-un enum{Autobuz, Tramvai, Troleibuz}. fara enum

public class Program {

    public static void afisareMijlocTransport(Factory factory, String nrIntmatriculare){
        MijlocTransport mijlocTransport = factory.getMijlocTransport(nrIntmatriculare);
        mijlocTransport.afiseazaDescriere();
    }

    public static void main(String[] args) {
        //cu met statica
        afisareMijlocTransport(new AutobuzFactory(), "B-12-BBB");
        //fara met statica
        MijlocTransport troileibuz = new TroleibuzFatory().getMijlocTransport("B-123456");
        troileibuz.afiseazaDescriere();
        //fara met statica inline
        new TramvaiFactory().getMijlocTransport("B-987654").afiseazaDescriere();
    }
}
