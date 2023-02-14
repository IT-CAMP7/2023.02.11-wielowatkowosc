package pl.camp.it.wielowotkowosc.wyszukiwanie;

import java.util.Random;

public class MinFinder implements Runnable {

    int[] tab;
    int startIndex;
    int endIndex;

    public MinFinder(int[] tab, int startIndex, int endIndex) {
        this.tab = tab;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(int i = this.startIndex; i < this.endIndex; i++) {
            this.tab[i] = random.nextInt(2000000001);
        }

        int min = this.tab[this.startIndex];
        for(int i = this.startIndex; i < this.endIndex; i++) {
            if(tab[i] < min) {
                min = tab[i];
            }
        }
        synchronized (App2.partialResults) {
            App2.partialResults.add(min);
        }
    }
}
