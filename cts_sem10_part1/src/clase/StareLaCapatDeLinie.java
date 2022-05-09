package clase;

public class StareLaCapatDeLinie implements Stare{
    @Override
    public void doAction(Autobuz autobuz) {

        if(!(autobuz.getStare() instanceof StareInCursa)) {
            System.out.println("Autobuzul " + autobuz.getCod() + "ajunge la capat de linie!");
            autobuz.setStare(this);
        } else{
            System.out.println("Autobuzul " + autobuz.getCod() + "este deja la capat de linie");
        }
    }
}
