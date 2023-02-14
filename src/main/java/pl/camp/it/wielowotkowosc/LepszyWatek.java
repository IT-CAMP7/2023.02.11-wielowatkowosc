package pl.camp.it.wielowotkowosc;

public class LepszyWatek implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
