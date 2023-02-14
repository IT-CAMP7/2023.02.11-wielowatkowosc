package pl.camp.it.wielowotkowosc.incrementator;

public class App {

    public static int counter = 0;
    public static final Object lock = new Object();

    public static void main(String[] args) {
        IncrementatorSynchronizedClass incrementatorSynchronizedClass =
                new IncrementatorSynchronizedClass();
        Thread t1 = new Thread(new Incrementator(incrementatorSynchronizedClass));
        Thread t2 = new Thread(new Incrementator(incrementatorSynchronizedClass));
        Thread t3 = new Thread(new Incrementator(incrementatorSynchronizedClass));
        Thread t4 = new Thread(new Incrementator(incrementatorSynchronizedClass));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter);
    }
}
