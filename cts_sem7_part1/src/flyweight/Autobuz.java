package flyweight;

public class Autobuz implements AutobuzLinie{
    private String model;
    private int an;
    private int nrLocuri;

    public Autobuz(String model, int an, int nrLocuri) {
        this.model = model;
        this.an = an;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void descriere(Linie linie) {
        System.out.println(this.toString() + " " + linie.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", an=").append(an);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
