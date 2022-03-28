package clase;

public class Autobuz extends MijlocTransport {

    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append(getNrInmatriculare());
        sb.append('}');
        return sb.toString();
    }
}
