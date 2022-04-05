package clase;

public class Autobuz {
    private String numeSofer;
    private String model;
    private String nrLinie;
    private int nrLocuri;
    private String nrInmatriculare;
    private Boolean deschidereUsi;
    private Boolean oprireLaCapatDeLinie;

    Autobuz(String numeSofer, String model, String nrLinie, int nrLocuri, String nrInmatriculare, Boolean deschidereUsi, Boolean oprireLaCapatDeLinie) {
        this.numeSofer = numeSofer;
        this.model = model;
        this.nrLinie = nrLinie;
        this.nrLocuri = nrLocuri;
        this.nrInmatriculare = nrInmatriculare;
        this.deschidereUsi = deschidereUsi;
        this.oprireLaCapatDeLinie = oprireLaCapatDeLinie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLinie='").append(nrLinie).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", deschidereUsi=").append(deschidereUsi);
        sb.append(", oprireLaCapatDeLinie=").append(oprireLaCapatDeLinie);
        sb.append('}');
        return sb.toString();
    }
}
