package TD6;

public class Factoriel implements Runnable {
    private int start;
    private int end;
    private long[] results;

    public Factoriel(int start, int end, long[] results) {
        this.start = start;
        this.end = end;
        this.results = results;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (i == 1) {
                results[i-1] = 1;
            } else {
                results[i-1] = i * results[i-2];
            }
        }
    }

    public static void main(String[] args) {
        int n = 100;
        int numThreads = 10;
        long[] results = new long[n];

        Thread[] threads = new Thread[numThreads];
        Factoriel[] calculators = new Factoriel[numThreads];
        int start = 1;
        int end = n / numThreads;
        for (int i = 0; i < numThreads; i++) {
            calculators[i] = new Factoriel(start, end, results);
            threads[i] = new Thread(calculators[i]);
            threads[i].start();
            start = end + 1;
            end = (i == numThreads - 2) ? n : end + (n / numThreads);
        }

        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the results
        for (int i = 0; i < n; i++) {
            System.out.println("Factorial of " + (i+1) + " is " + results[i]);
        }
    }
}


