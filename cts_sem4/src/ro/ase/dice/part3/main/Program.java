package ro.ase.dice.part3.main;

import ro.ase.dice.part3.clase.Autobuz;
import ro.ase.dice.part3.clase.AutobuzBuilder;

// Pentru obiectele de tipul AutobuzLinie se doreste ca in momentul in care au fost
// create obiectele de acest tip sa nu mai poata fi modificate. De asemenea pentru crearea unui obiect de tipul AutobuzLinie
// trebuie precizat modelul de autobuz folosit, soferul care il va conduce, daca va avea opriri la capat de linie, daca deschide
// usile in fiecare statie fara ca pasagerii sa solicite acest lucru, textul afisat de ecranul derulator si alte elemente.
// Unele atribute sunt optionale avand o valoare prestabilita. Se doreste implementarea modulului care se va ocupa de initializarea
// acestor obiecte, nefiind necesara introducerea atributelor optionale,
// iar obiectul odata creat sa nu mai poata fi modificat. --> facem settteri default ca sa poata fi apelati doar in pachet sau
// sau builderul sa fie inner class in Autobuz
public class Program {

    public static void main(String[] args) {

        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNrInmatriculare("B-666666");
        autobuzBuilder.setOprireLaCapatDeLinie(true);
        autobuzBuilder.setNrLocuri(80);

        //cu builder
        Autobuz autobuz1 = autobuzBuilder.build();
        //fara builder
        Autobuz autobuz2 = new AutobuzBuilder().setDeschidereUsi(false).build();

        System.out.println(autobuz1);
        System.out.println(autobuz2);

    }
}
