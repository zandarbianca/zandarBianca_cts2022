package main;

import flyweight.Autobuz;
import flyweight.AutobuzLinie;
import flyweight.FlyweightFactory;

public class Program {
    public static void main(String[] args) {

        AutobuzLinie autobuz1 = new Autobuz("Model1",2000,40);
        AutobuzLinie autobuz2 = new Autobuz("Model2",2001,50);
        AutobuzLinie autobuz3 = new Autobuz("Model3",2002,60);
        AutobuzLinie autobuz4 = new Autobuz("Model4",2003,70);

        FlyweightFactory factory = new FlyweightFactory();
        autobuz1.descriere(factory.getLinie(168));
        autobuz2.descriere(factory.getLinie(226));
        autobuz3.descriere(factory.getLinie(168));
        autobuz4.descriere(factory.getLinie(137));
    }
}
