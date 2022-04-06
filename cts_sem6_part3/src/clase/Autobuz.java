package clase;

public class Autobuz implements MijlocDeTransport {
    private int nrCalatori;
    private int nrLinie;

    public Autobuz(int nrCalatori, int nrLinie) {
        this.nrCalatori = nrCalatori;
        this.nrLinie = nrLinie;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul a oprit la linie" +  nrLinie + "si are " + nrCalatori + "calatori");
    }

}
