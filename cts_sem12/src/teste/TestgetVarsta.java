package teste;

import org.junit.Test;
import testarePersoana.Persoana;

import static org.junit.Assert.assertEquals;

public class TestgetVarsta {

    @Test
    public void testRightM(){
        Persoana p = new Persoana("Andrei", "198120328123");
        assertEquals(23,p.getVarsta());
    }

    @Test
    public void testBoundaryInferior(){
        Persoana p = new Persoana("Mihai", "3000101407216");
        assertEquals(222,p.getVarsta());
    }

    @Test
    public void testBoundarySuperior(){
        Persoana p = new Persoana("Florina", "6220101072169");
        assertEquals(0,p.getVarsta());
    }

}
