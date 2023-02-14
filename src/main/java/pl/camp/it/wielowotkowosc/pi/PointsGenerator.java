package pl.camp.it.wielowotkowosc.pi;

import java.util.Random;

public class PointsGenerator implements Runnable {

    long pointsToGenerate;

    public PointsGenerator(long pointsToGenerate) {
        this.pointsToGenerate = pointsToGenerate;
    }

    @Override
    public void run() {
        long pointsInCircle = 0;
        Random random = new Random();
        for(int i = 0; i < pointsToGenerate; i++) {
            double x = random.nextDouble() * 2 - 1;
            double y = random.nextDouble() * 2 - 1;
            double distance = Math.sqrt(x*x + y*y);

            if(distance <= 1) {
                pointsInCircle++;
            }
        }

        synchronized (App2.partialCounts) {
            App2.partialCounts.add(pointsInCircle);
        }
    }
}
