package clase;

public class AutobuzBuilder implements Builder{
    private String numeSofer;
    private String model;
    private String nrLinie;
    private int nrLocuri;
    private String nrInmatriculare;
    private Boolean deschidereUsi;
    private Boolean oprireLaCapatDeLinie;

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilder setNrLinie(String nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }

    public AutobuzBuilder setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
        return this;
    }

    public AutobuzBuilder setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
        return this;
    }

    public AutobuzBuilder setDeschidereUsi(Boolean deschidereUsi) {
        this.deschidereUsi = deschidereUsi;
        return this;
    }

    public AutobuzBuilder setOprireLaCapatDeLinie(Boolean oprireLaCapatDeLinie) {
        this.oprireLaCapatDeLinie = oprireLaCapatDeLinie;
        return this;
    }

    @Override
    public Autobuz build() {
        Autobuz autobuz = new Autobuz(this.numeSofer,this.model,this.nrLinie,this.nrLocuri,this.nrInmatriculare,this.deschidereUsi,this.oprireLaCapatDeLinie);
        return autobuz;
    }
}
