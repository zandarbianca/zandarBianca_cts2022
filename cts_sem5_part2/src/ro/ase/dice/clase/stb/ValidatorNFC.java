package ro.ase.dice.clase.stb;

public class ValidatorNFC implements ValidatorStb{
    @Override
    public void validareBiltStb() {
        System.out.println("Valideaza bilet stb");
    }

    @Override
    public void validareAbonamentStb() {
        System.out.println("Valideaza abonament stb");
    }
}
