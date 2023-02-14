package pl.camp.it.wielowotkowosc.executors;

public class Watek implements Runnable {
    int threadNo;

    public Watek(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Watek: " + threadNo + " i: " + i);
        }
    }
}
