package ro.ase.dice.part1.factory;

import ro.ase.dice.part1.clase.Autobuz;
import ro.ase.dice.part1.clase.MijlocTransport;

public class AutobuzFactory implements Factory{

    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
