package teste;

import jUnit.Matematica;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatematicaTest {

    private Matematica matematica;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass!");
    }

    @Before
    public void setUp(){
        this.matematica = Matematica.getInstantaMatematica();
        System.out.println("A fost apelat!");

    }
    //---SINGLETON
    @Test
    public void testSingletonMatematica(){
        Matematica m = Matematica.getInstantaMatematica();
        assertSame(matematica,m);
    }

    @Test
    public void testListaNrCrescatoare(){
        List<Integer> list = matematica.nNumerePare(4);
        for(int i=0;i<list.size()-1;i++){
            assertTrue(list.get(i) < list.get(i+1));
        }
    }
    //----

    //suma
    @Test
    public void testSumaCorecta(){
        assertEquals(8,matematica.suma(3,5));
    }

    @Test
    public void testSumaNumereIdentice(){
        int nr = 3;
        assertEquals(6,matematica.suma(nr,nr));
    }

    //raport
    @Test
    public void testRaportCorect(){
        assertEquals(6,matematica.raport(36,6),0.01);
    }

    @Test
    public void testRaportCuRezNrReal(){
        assertEquals(2.5,matematica.raport(5,2),0.001);
    }

    //JUnit3
    @Test
    public void testRaportShouldThrowException(){
        try{
            matematica.raport(56,0);
            fail("Metoda raport nu arunca exceptie!");
        }catch (IllegalArgumentException exception){

        }
    }

    //JUnit4
    @Test(expected = IllegalArgumentException.class)
    public void testRaportThrowException(){
        matematica.raport(49,0);
    }

    //par
    @Test
    public void testVerificaPar(){
        assertTrue(matematica.estePar(2));
        assertFalse(matematica.estePar(3));
        assertTrue(matematica.estePar(0));
        assertTrue(matematica.estePar(-2));
        assertFalse(matematica.estePar(-5));

    }

    //lista
    @Test
    public void testVerificaListaNrPare(){
        assertEquals(4,matematica.nNumerePare(4).size());
    }

    @Test
    public void testVerificaListaNrPare2(){
        List<Integer> list = matematica.nNumerePare(4);
        for (int i: list) {
            assertTrue(matematica.estePar(i));
        }
    }

    @Test
    public void testVerificaListaNull(){
        assertNull(matematica.nNumerePare(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListaNegativ(){
        matematica.nNumerePare(-3);
    }


}