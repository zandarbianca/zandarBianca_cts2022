package memento;

import java.util.ArrayList;
import java.util.List;

public class Autobaza {

    private List<MementoAutobuz> listaMemento;

    public Autobaza() {
        this.listaMemento = new ArrayList<>();
    }

    public void adaugareMementoAutobuz(MementoAutobuz mementoAutobuz){
        listaMemento.add(mementoAutobuz);
    }

    public MementoAutobuz getMementoAutobuz(int index){
        return listaMemento.get(index);
    }
}
