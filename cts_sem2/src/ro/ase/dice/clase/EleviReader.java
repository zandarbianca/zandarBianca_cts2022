package ro.ase.dice.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends Reader {
    public EleviReader(String file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicant() throws FileNotFoundException {

        super.scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (super.scanner.hasNext()) {
            Elev elev = new Elev();
            readAplicanti(super.scanner,elev);
            elev.setTutore(super.scanner.next());
            elevi.add(elev);
        }

        super.scanner.close();
        return elevi;
    }
}
