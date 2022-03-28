package clase;

public class Program {
    public static void main(String[] args) {

        MijlocTransport autobuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Autobuz,"B98ABC");
        MijlocTransport tramvai = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Tramvai,"B88EFG");
        MijlocTransport troleibuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Troleibuz,"B78HIJ");

        System.out.println("Autobuz = " + autobuz);
        System.out.println("Tramvai = " + tramvai);
        System.out.println("Troleibuz = " + troleibuz);
    }
}
