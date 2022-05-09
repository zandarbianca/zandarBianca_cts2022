package clase;

public class Autobuz {
    private int cod;
    private Stare stare;

    public Autobuz(int cod) {
        this.cod = cod;
        this.stare = new StareLaCapatDeLinie();
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
            this.stare = stare;
    }

    public void pleacaInCursa(){
        StareInCursa stareInCursa = new StareInCursa();
        stareInCursa.doAction(this);
    }

    public void ieseDinService(){
        StareLaReparat stareLaReparat = new StareLaReparat();
        stareLaReparat.doAction(this);
    }

    public void ajungeLaCapatDeLinie(){
        StareLaCapatDeLinie stareLaCapatDeLinie = new StareLaCapatDeLinie();
        stareLaCapatDeLinie.doAction(this);
    }

}
