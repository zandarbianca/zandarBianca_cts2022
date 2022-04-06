package clase.decorator;

import clase.PrinterBilet;

public class PrinterMesajPaste extends Decorator{

    public PrinterMesajPaste(PrinterBilet printerBilet) {
        super(printerBilet);
    }

    @Override
    public void afiseazaVerso() {
        System.out.println("Paste Fericit");
        System.out.println("Am desenat si un iepuras!");
    }
}
