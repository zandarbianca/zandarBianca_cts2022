package ro.ase.dice.clase_5.main;

import ro.ase.dice.clase_5.METROU.ValidatorScanare;
import ro.ase.dice.clase_5.STB.ValidatorAdapter;

public class Program {
    public static void main(String[] args) {
        ValidatorScanare validatorScanare = new ValidatorScanare();
        ValidatorAdapter validatorAdapter = new ValidatorAdapter(validatorScanare);
        validatorAdapter.validareBiltStb();
        validatorAdapter.validareAbonamentStb();
    }
}
