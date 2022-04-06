package clase;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class Grup implements MijlocTransport{
    List<MijlocTransport> mijlocTransportList;
    private String denumire;

    public Grup(String denumire) {
        this.mijlocTransportList = new ArrayList<>();
        this.denumire = denumire;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Denumire " + denumire);
        for (MijlocTransport mj:mijlocTransportList ) {
            mj.afiseazaDescriere();
        }
    }

    @Override
    public void adaugaMijlocTransport(MijlocTransport mijlocTransport) throws ExecutionControl.NotImplementedException {
        mijlocTransportList.add(mijlocTransport);
    }

    @Override
    public void stergeMijlocTransport(MijlocTransport MijlocTransport) throws ExecutionControl.NotImplementedException {
        mijlocTransportList.remove(mijlocTransportList);
    }

    @Override
    public MijlocTransport getMijlocTransport(int index) throws ExecutionControl.NotImplementedException {
        return mijlocTransportList.get(index);
    }
}
