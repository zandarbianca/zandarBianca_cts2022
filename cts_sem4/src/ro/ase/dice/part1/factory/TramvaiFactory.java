package ro.ase.dice.part1.factory;

import ro.ase.dice.part1.clase.MijlocTransport;
import ro.ase.dice.part1.clase.Tramvai;

public class TramvaiFactory implements Factory{
    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
