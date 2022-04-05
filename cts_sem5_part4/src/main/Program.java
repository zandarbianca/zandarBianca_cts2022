package main;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Program {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumeSofer("Gigi").setNrLocuri(80);

        Autobuz autobuz = autobuzBuilder.build();
        System.out.println(autobuz.toString());
    }
}
