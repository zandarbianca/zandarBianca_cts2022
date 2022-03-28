package clase;

public class Tramvai extends MijlocTransport {

    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append(getNrInmatriculare());
        sb.append('}');
        return sb.toString();
    }
}
