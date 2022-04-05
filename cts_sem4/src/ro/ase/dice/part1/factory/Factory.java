package ro.ase.dice.part1.factory;

import ro.ase.dice.part1.clase.MijlocTransport;

public interface Factory {
    MijlocTransport getMijlocTransport(String nrInmatriculare);
}
