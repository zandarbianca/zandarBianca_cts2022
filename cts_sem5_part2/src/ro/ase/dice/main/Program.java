package ro.ase.dice.main;

import ro.ase.dice.clase.metrou.ValidatorMetrou;
import ro.ase.dice.clase.metrou.ValidatorScanare;
import ro.ase.dice.clase.stb.ValidatorAdapter;
import ro.ase.dice.clase.stb.ValidatorNFC;
import ro.ase.dice.clase.stb.ValidatorStb;

public class Program {
    private static void validareAbonament(ValidatorStb validator){
        validator.validareAbonamentStb();
    }

    public static void main(String[] args) {
        ValidatorStb val = new ValidatorNFC();
        validareAbonament(val);

        ValidatorMetrou valm =  new ValidatorScanare();
       // validareAbonament(valm);

        ValidatorAdapter adapter = new ValidatorAdapter();
//        adapter.validareBiltStb();
//        adapter.validareAbonamentStb();
        validareAbonament(adapter);
    }
}
