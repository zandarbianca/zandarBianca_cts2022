package main;

import clase.Facade;

//Facade = apelul mai multor metode dintr o singura clasa
public class Program {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.deschideToateUsile();
        //facade.liberToateUsile();
    }
}
