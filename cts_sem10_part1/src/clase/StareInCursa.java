package clase;

public class StareInCursa implements Stare {

    @Override
    public void doAction(Autobuz autobuz) {
        if(autobuz.getStare() instanceof StareLaCapatDeLinie) {
            System.out.println("Autobuzul " + autobuz.getCod() + "pleaca in cursa!");
            autobuz.setStare(this);
        } else{
            System.out.println("Autobuzul " + autobuz.getCod() + "nu poate pleaca in cursa!");
        }
    }
}
