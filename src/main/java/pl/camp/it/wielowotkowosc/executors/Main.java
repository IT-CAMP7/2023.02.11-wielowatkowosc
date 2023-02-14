package pl.camp.it.wielowotkowosc.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        /*ExecutorService singleExecutor = Executors.newSingleThreadExecutor();

        singleExecutor.submit(new Watek());
        singleExecutor.submit(new Watek());
        singleExecutor.submit(new Watek());

        singleExecutor.shutdown();*/

        /*ExecutorService multiExecutor = Executors.newFixedThreadPool(4);

        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());

        multiExecutor.shutdown();*/

        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(4);

        scheduledExecutorService.schedule(new Watek(1), 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(2), 0, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(3), 7, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(4), 2, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(5), 10, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(6), 0, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(7), 8, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
