package pl.camp.it.wielowotkowosc.notify;

public class Receiver implements Runnable {
    @Override
    public void run() {
        try {
            synchronized (Main.communicationChannel) {
                System.out.println("Odbiorca sie odpala !!!");
                System.out.println("Odbiorca czeka !!!");

                while (!Main.notificationFlag) {
                    Main.communicationChannel.wait();
                }

                System.out.println("Odbiorca odebral sygnal !!!");
                System.out.println("Wiadomosc:");
                System.out.println(Main.message);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
