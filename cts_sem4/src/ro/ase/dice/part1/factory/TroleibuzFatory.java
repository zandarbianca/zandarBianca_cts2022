package ro.ase.dice.part1.factory;

import ro.ase.dice.part1.clase.MijlocTransport;
import ro.ase.dice.part1.clase.Troleibuz;

public class TroleibuzFatory implements Factory{
    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
