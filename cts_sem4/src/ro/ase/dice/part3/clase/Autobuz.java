package ro.ase.dice.part3.clase;

public class Autobuz {
    private String numeSofer;
    private String nrInmatriculare;
    private String nrLinie;
    private Boolean deschidereUsi;
    private Boolean oprireLaCapatDeLinie;
    private String textDerulat;
    private int nrLocuri;

     Autobuz() {
        this.numeSofer = "Doru";
        this.nrInmatriculare = "B-123456";
        this.nrLinie = "1";
        this.deschidereUsi = true;
        this.oprireLaCapatDeLinie = true;
        this.textDerulat = "text";
        this.nrLocuri = 20;
    }

     void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

     void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

     void setNrLinie(String nrLinie) {
        this.nrLinie = nrLinie;
    }

     void setDeschidereUsi(Boolean deschidereUsi) {
        this.deschidereUsi = deschidereUsi;
    }

     void setOprireLaCapatDeLinie(Boolean oprireLaCapatDeLinie) {
        this.oprireLaCapatDeLinie = oprireLaCapatDeLinie;
    }

     void setTextDerulat(String textDerulat) {
        this.textDerulat = textDerulat;
    }

     void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", nrLinie='").append(nrLinie).append('\'');
        sb.append(", deschidereUsi=").append(deschidereUsi);
        sb.append(", oprireLaCapatDeLinie=").append(oprireLaCapatDeLinie);
        sb.append(", textDerulat='").append(textDerulat).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
