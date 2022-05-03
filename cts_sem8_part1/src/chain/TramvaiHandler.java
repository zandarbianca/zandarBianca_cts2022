package chain;

public class TramvaiHandler extends Handler {

    public TramvaiHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if(distanta < limita) {
            System.out.println("Poti folosi tramvaiul");
        }
        else {
            super.handler.afisareMijlocTransport(distanta);
        }
    }
}
