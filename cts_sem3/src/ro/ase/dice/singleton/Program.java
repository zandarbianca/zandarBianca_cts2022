package ro.ase.dice.singleton;

public class Program {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstanta();
        Singleton s2 = Singleton.getInstanta();
        System.out.println("s1  " + s1);
        System.out.println("s2  " + s2);
    }
}
