package clase;

public class Troleibuz extends MijlocTransport {

    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Troleibuz{");
        sb.append(getNrInmatriculare());
        sb.append('}');
        return sb.toString();
    }
}
