package pl.camp.it.wielowotkowosc.notify;

import java.util.Map;

public class Sender implements Runnable {
    @Override
    public void run() {
        try {
            synchronized (Main.communicationChannel) {
                System.out.println("Nadawca cos robi !!!");
                Thread.sleep(1000);
                System.out.println("Nadawca dalej cos robi !!!");
                Thread.sleep(1000);
                System.out.println("Nadawca nadal cos robi !!!");
                Thread.sleep(1000);
                System.out.println("Nadawca wysyla !!!");
                Main.message = "Tajna wiadomosc !!!";
                Main.notificationFlag = true;
                Main.communicationChannel.notify();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
