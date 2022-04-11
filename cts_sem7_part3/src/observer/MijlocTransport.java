package observer;

import java.util.ArrayList;
import java.util.List;

public class MijlocTransport {
    List<ICalator> listaCalatori;
    private int nrLinie;

    public MijlocTransport(int nrLinie) {
        this.listaCalatori = new ArrayList<>();
        this.nrLinie = nrLinie;
    }

    public void adaugaCalatori(ICalator calator){
        listaCalatori.add(calator);
    }

    public void stergeCalatori(ICalator calator){
        listaCalatori.remove(calator);
    }

    public void trimiteMesaj(String mesaj){
        for (ICalator calator: listaCalatori) {
            calator.primireMesaj(mesaj);
        }
    }

    public void trimiteMesajPlecareCapatLinie(){
        trimiteMesaj("Am plecat din capatul liniei: " + nrLinie);
    }
}
