package chain;

public class MetrouHandler extends Handler {

    public MetrouHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if(distanta < limita) {
            System.out.println("Poti folosi metroul");
        }
        else {
            super.handler.afisareMijlocTransport(distanta);
        }
    }
}
