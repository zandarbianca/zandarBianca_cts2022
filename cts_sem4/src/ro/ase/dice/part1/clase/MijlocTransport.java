package ro.ase.dice.part1.clase;

public abstract class MijlocTransport {
    protected String nrInmatriculare;

    public MijlocTransport(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public abstract void afiseazaDescriere();
}
