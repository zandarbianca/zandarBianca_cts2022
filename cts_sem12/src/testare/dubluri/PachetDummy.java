package testare.dubluri;

import agentie.IPachetTuristic;

public class PachetDummy implements IPachetTuristic {


    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici() {

    }

    @Override
    public Double getPret() {
        return null;
    }
}
