package observer;

public class Calator implements ICalator{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primireMesaj(String mesaj) {
        System.out.println(nume + " a primit mesajul: " + mesaj);
    }
}
