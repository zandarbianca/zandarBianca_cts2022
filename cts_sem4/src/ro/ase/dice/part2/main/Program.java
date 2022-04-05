package ro.ase.dice.part2.main;

import ro.ase.dice.part2.prototype.Autobuz;

//2. Pentru crearea de obiecte de tip Autobuz sunt consumate foarte multe resurse. Din acest motiv trebuie propusa o varianta prin care daca exista deja un obiect creat, sa fie folosit acest obiect pentru viitoarele obiecte, fara a mai fi nevoie de crearea de la 0 a obiectelor de tip Autobuz.
//
//Aceeasi regula se va aplica si pentru alte tipuri de mijloace de transport.
public class Program {
    public static void main(String[] args) throws CloneNotSupportedException {
        Autobuz a1 = new Autobuz("Gigel");
        Autobuz a2 = (Autobuz) a1.copiaza();

        a2.setNumeSofer("Andrei");

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
