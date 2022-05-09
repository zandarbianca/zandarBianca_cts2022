package command;

public class ComandaPlecare implements Comanda {
    private Autobuz autobuz;
    private int linie;

    public ComandaPlecare(Autobuz autobuz, int linie) {
        this.autobuz = autobuz;
        this.linie = linie;
    }

    @Override
    public void executa() {
        autobuz.pleacaInCursa(linie);
    }
}
