package pl.camp.it.wielowotkowosc.notify;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static final Object communicationChannel = new Object();
    public static boolean notificationFlag = false;
    public static String message = null;
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(5);

        scheduledExecutorService.schedule(new Receiver(), 0, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Sender(), 5, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
