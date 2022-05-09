package clase;

public class StareLaReparat implements Stare {

    @Override
    public void doAction(Autobuz autobuz) {

        if(autobuz.getStare() instanceof StareLaCapatDeLinie) {
            System.out.println("Autobuzul " + autobuz.getCod() + "intra in service!");
            autobuz.setStare(this);
        } else{
            System.out.println("Autobuzul " + autobuz.getCod() + "nu poate intra in service!");
        }
    }
}
