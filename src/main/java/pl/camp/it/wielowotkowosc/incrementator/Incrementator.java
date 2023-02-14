package pl.camp.it.wielowotkowosc.incrementator;

public class Incrementator implements Runnable {

    IncrementatorSynchronizedClass incrementatorSynchronizedClass;

    public Incrementator(IncrementatorSynchronizedClass incrementatorSynchronizedClass) {
        this.incrementatorSynchronizedClass = incrementatorSynchronizedClass;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            this.incrementatorSynchronizedClass.increment();
        }
    }
    private synchronized void increment() {
        App.counter++;
    }
}
