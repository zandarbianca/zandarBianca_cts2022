import chain.AutobuzHandler;
import chain.MetrouHandler;
import chain.TramvaiHandler;
import chain.TroleibuzHandler;

public class Main {
    public static void main(String[] args) {
        AutobuzHandler autobuzHandler = new AutobuzHandler(5);
        TroleibuzHandler troleibuzHandler = new TroleibuzHandler(3);
        TramvaiHandler tramvaiHandler = new TramvaiHandler(10);
        MetrouHandler metrouHandler = new MetrouHandler(1000);

        troleibuzHandler.setHandler(autobuzHandler);
        autobuzHandler.setHandler(tramvaiHandler);
        tramvaiHandler.setHandler(metrouHandler);

//        troleibuzHandler.afisareMijlocTransport(7);
//        troleibuzHandler.afisareMijlocTransport(20);
//        troleibuzHandler.afisareMijlocTransport(2);
//        troleibuzHandler.afisareMijlocTransport(4);

        //alt oras
        AutobuzHandler autobuzCluj = new AutobuzHandler(1000);
        TroleibuzHandler troleibuzCluj = new TroleibuzHandler(5);
        TramvaiHandler tramvaiCluj = new TramvaiHandler(2);

        tramvaiCluj.setHandler(troleibuzCluj);
        troleibuzCluj.setHandler(autobuzCluj);

        tramvaiCluj.afisareMijlocTransport(1);
        tramvaiCluj.afisareMijlocTransport(3);
        tramvaiCluj.afisareMijlocTransport(10);
    }
}
