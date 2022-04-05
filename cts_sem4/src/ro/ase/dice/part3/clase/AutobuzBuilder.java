package ro.ase.dice.part3.clase;


public class AutobuzBuilder implements Builder{
    private Autobuz autobuz;

    public AutobuzBuilder() {
        this.autobuz = new Autobuz();
    }

    @Override
    public Autobuz build() {
        return this.autobuz;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.autobuz.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuilder setNrInmatriculare(String nrInmatriculare) {
        this.autobuz.setNrInmatriculare(nrInmatriculare);
        return this;
    }

    public AutobuzBuilder setNrLinie(String nrLinie) {
        this.autobuz.setNrLinie(nrLinie);
        return this;
    }

    public AutobuzBuilder setDeschidereUsi(Boolean deschidereUsi) {
        this.autobuz.setDeschidereUsi(deschidereUsi);
        return this;
    }

    public AutobuzBuilder setOprireLaCapatDeLinie(Boolean oprireLaCapatDeLinie) {
        this.autobuz.setOprireLaCapatDeLinie(oprireLaCapatDeLinie);
        return this;
    }

    public AutobuzBuilder setTextDerulat(String textDerulat) {
        this.autobuz.setTextDerulat(textDerulat);
        return this;
    }

    public AutobuzBuilder setNrLocuri(int nrLocuri) {
        this.autobuz.setNrLocuri(nrLocuri);
        return this;
    }
}
