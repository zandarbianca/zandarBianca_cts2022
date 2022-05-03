import memento.Autobaza;
import memento.Autobuz;
import memento.MementoAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Gigel", 6, 2000, "Otokar");
        Autobaza autobaza = new Autobaza();
        MementoAutobuz memento = autobuz.createMementoAutobuz();

        autobaza.adaugareMementoAutobuz(memento);

        autobuz.setNumeSofer("Doru");
        autobaza.adaugareMementoAutobuz(autobuz.createMementoAutobuz());

        autobuz.setConsumMediu(8);
        autobaza.adaugareMementoAutobuz(autobuz.createMementoAutobuz());

        System.out.println(autobuz.toString());
        autobuz.setMementoAutobuz(autobaza.getMementoAutobuz(0));
        System.out.println("Dupa preluare memento din autobaza:");
        System.out.println(autobuz.toString());

    }
}
