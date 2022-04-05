package clase;

public class Facade {
    private Autobuz autobuz;

    public Facade(){
        this.autobuz = new Autobuz();
    }

    public void deschideToateUsile(){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public void liberToateUsile(){
        autobuz.liberUsaFata();
        autobuz.liberUsaMijloc();
        autobuz.liberUsaSpate();
    }
}
