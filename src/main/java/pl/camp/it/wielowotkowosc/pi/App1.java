package pl.camp.it.wielowotkowosc.pi;

import java.util.Random;

public class App1 {
    public static void main(String[] args) {
        int allPoints = 2100000000;
        int pointsInCircle = 0;

        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for(int i = 0; i < allPoints; i++) {
            double x = random.nextDouble() * 2 - 1;
            double y = random.nextDouble() * 2 - 1;
            double distance = Math.sqrt(x*x + y*y);

            if(distance <= 1) {
                pointsInCircle++;
            }
        }

        double PI = 4.0 * pointsInCircle / allPoints;
        long endTime = System.currentTimeMillis();
        System.out.println(PI);
        System.out.println(endTime - startTime);
    }
}
