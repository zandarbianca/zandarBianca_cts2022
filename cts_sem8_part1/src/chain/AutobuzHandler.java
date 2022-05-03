package chain;

import java.sql.SQLOutput;

public class AutobuzHandler extends Handler {


    public AutobuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if(distanta < limita) {
            System.out.println("Poti folosi autobuzul");
        }
        else {
            super.handler.afisareMijlocTransport(distanta);
        }

    }
}
