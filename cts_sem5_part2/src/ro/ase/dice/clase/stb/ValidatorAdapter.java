package ro.ase.dice.clase.stb;

import ro.ase.dice.clase.metrou.ValidatorScanare;

public class ValidatorAdapter extends ValidatorScanare implements ValidatorStb {

    @Override
    public void validareBiltStb() {
        super.valideazaBiletMetrou();
    }

    @Override
    public void validareAbonamentStb() {
        super.valideazaAbonamentMetrou();
    }
}
