package testare.teste;

import agentie.AgentieTurism;
import agentie.IPachetTuristic;
import org.junit.Test;
import testare.dubluri.PachetDummy;
import testare.dubluri.PachetFake;

import static org.junit.Assert.assertEquals;


public class AgentieTurismTest {

    @Test
    public void testAdaugaPachet(){
        AgentieTurism agentieTurism = new AgentieTurism();
        IPachetTuristic pachetDummy = new PachetDummy();
        agentieTurism.adaugaPachet(pachetDummy);
        assertEquals(1,agentieTurism.getNumarPacheteTuristice());
    }


    @Test
    public void testCalculareSumaTotalaPachete(){
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetFake pachetFake1 = new PachetFake();
        PachetFake pachetFake2 = new PachetFake();

        pachetFake1.setPretFake(3000.0);
        pachetFake2.setPretFake(4500.0);

        agentieTurism.adaugaPachet(pachetFake1);
        agentieTurism.adaugaPachet(pachetFake2);



        assertEquals(7500.0,agentieTurism.calculareSumaTotalaPachete(),0.001);
    }

}
