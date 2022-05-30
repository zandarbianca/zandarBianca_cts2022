package testare.dubluri;

import agentie.IPachetTuristic;

public class PachetFake implements IPachetTuristic {
    private boolean rezervareFake;
    private Double pretFake;

    public void setRezervareFake(boolean rezervareFake) {
        this.rezervareFake = rezervareFake;
    }

    public void setPretFake(Double pretFake) {
        this.pretFake = pretFake;
    }

    @Override
    public boolean poateRezerva() {
        return this.rezervareFake;
    }

    @Override
    public void aplicaDiscountVarstnici() {

    }

    @Override
    public Double getPret() {
        return this.pretFake;
    }
}
