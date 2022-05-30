package testare.dubluri;

import persoana.IPersoana;

public class PersoanaFake implements IPersoana {

    @Override
    public String getSex() {
        return null;
    }

    @Override
    public int getVarsta() {
        return 0;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
