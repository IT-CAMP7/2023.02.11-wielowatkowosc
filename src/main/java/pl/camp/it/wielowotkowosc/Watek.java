package pl.camp.it.wielowotkowosc;

public class Watek extends Thread {

    int no;

    public Watek(int no) {
        this.no = no;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Watek " + this.no + ": i = " + i);
        }
    }
}
