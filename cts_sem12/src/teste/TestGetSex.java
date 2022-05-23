package teste;

import org.junit.Test;
import testarePersoana.CnpInvalidException;
import testarePersoana.IPersoana;
import testarePersoana.Persoana;

import static org.junit.Assert.*;

public class TestGetSex {

    @Test
    public void testRightM(){
        Persoana p = new Persoana("Andrei", "500045678853");
        assertEquals("M",p.getSex());
    }

    @Test
    public void testBoundaryInferior(){
        Persoana p = new Persoana("Mihai", "100121407216");
        assertEquals("M",p.getSex());
    }

    @Test
    public void testBoundarySuperior(){
        Persoana p = new Persoana("Florina", "600121407216");
        assertEquals("F",p.getSex());
    }

    @Test
    public void testCrossCheck(){
        Persoana p = new Persoana("Florina", "600090846255");
        int cifra = p.CNP.charAt(0);
        assertEquals(cifra%2 != 0 ? "M" : "F", p.getSex());
    }

    @Test(expected = CnpInvalidException.class)
    public void testError(){
        Persoana p = new Persoana("Florina", "g00090846255");
        p.getSex();
    }

    @Test(timeout = 100)
    public void testPerformance(){
        Persoana persoana = new Persoana("Maria","6001124070023");
        persoana.getSex();
    }

    @Test()
    public void testRangeSex(){
        Persoana persoana = new Persoana("Maria","9001124070023");
        assertEquals("N/A",persoana.getSex());
    }

    @Test(expected = NullPointerException.class)
    public void testExistentGetSex(){
        Persoana persoana = new Persoana("Maria",null);
        persoana.getSex();
    }

}