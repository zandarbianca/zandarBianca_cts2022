package chain;

public class TroleibuzHandler extends Handler {
    public TroleibuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if(distanta < limita) {
            System.out.println("Poti folosi troileibuzul");
        }
        else {
            super.handler.afisareMijlocTransport(distanta);
        }
    }
}
