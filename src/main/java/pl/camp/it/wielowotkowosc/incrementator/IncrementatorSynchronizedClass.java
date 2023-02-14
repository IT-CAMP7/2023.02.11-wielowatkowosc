package pl.camp.it.wielowotkowosc.incrementator;

public class IncrementatorSynchronizedClass {
    public synchronized void increment() {
        App.counter++;
    }
}
