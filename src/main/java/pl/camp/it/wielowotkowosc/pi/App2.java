package pl.camp.it.wielowotkowosc.pi;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static final List<Long> partialCounts = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        long allPoints = 7000000000L;
        List<Thread> threads = new ArrayList<>();
        int threadNumber = 15;
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < threadNumber; i++) {
            Thread t = new Thread(new PointsGenerator(allPoints/threadNumber));
            t.start();
            threads.add(t);
        }

        for(Thread t : threads) {
            t.join();
        }

        long pointsInCircle = partialCounts.stream().mapToLong(i -> i).sum();
        double PI = 4.0 * pointsInCircle / allPoints;
        long endTime = System.currentTimeMillis();

        System.out.println(PI);
        System.out.println(endTime - startTime);
    }
}
