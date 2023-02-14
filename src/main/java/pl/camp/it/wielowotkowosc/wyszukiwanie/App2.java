package pl.camp.it.wielowotkowosc.wyszukiwanie;

import java.util.ArrayList;
import java.util.List;

public class App2 {

    public static final List<Integer> partialResults = new ArrayList<>();

    public static void main(String[] args) {
        int[] tab = new int[1000000000];
        int threadsCount = 14;
        List<Thread> threads = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < threadsCount; i++) {
            Thread thread = new Thread(new MinFinder(tab, i * (tab.length / threadsCount), (i + 1) * (tab.length / threadsCount)));
            thread.start();
            threads.add(thread);
        }

        try {
            for(Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int min = partialResults.get(0);
        for(int element : partialResults) {
            if(element < min) {
                min = element;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println(min);
        System.out.println(endTime - startTime);
    }
}
