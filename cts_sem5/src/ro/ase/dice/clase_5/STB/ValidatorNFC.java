package ro.ase.dice.clase_5.STB;

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
