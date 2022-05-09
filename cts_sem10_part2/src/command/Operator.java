package command;

import java.util.ArrayList;
import java.util.List;

public class Operator {

    List<Comanda> comandaList;

    public Operator() {
        this.comandaList = new ArrayList<>();
    }

    public void invoca(Comanda comanda){
        comandaList.add(comanda);
    }

    public void executaComanda(){
        if(comandaList.size()>0){
            comandaList.get(0).executa();
            comandaList.remove(0);
        }
    }
}
