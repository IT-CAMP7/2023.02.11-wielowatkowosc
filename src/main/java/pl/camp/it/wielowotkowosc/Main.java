package pl.camp.it.wielowotkowosc;

public class Main {
    public static void main(String[] args) {
        /*Watek watek = new Watek(1);
        watek.start();

        Watek watek2 = new Watek(2);
        Watek watek3 = new Watek(3);

        watek2.start();
        watek3.start();*/

        Thread thread = new Thread(new LepszyWatek());
        thread.start();

        System.out.println("Ostatnia linia maina");
    }
}
