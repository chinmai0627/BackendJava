/*Given an array of size 100 containing values from 1 to 100,
Implement a multithreaded program in Java to calculate the sum of elements in the array.
Divide the array equally into 5 threads and compute the partial sums,
then combine the results to get the final sum.*/
package Week3;
public class MultithreadExample {
    private static int[] array = new int[100];
    private static int[] partialSums = new int[5];
    public static class SumCalculator implements Runnable {
        private int startIndex;
        private int endIndex;
        private int threadIndex;
        public SumCalculator(int startIndex, int endIndex, int threadIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.threadIndex = threadIndex;
        }
        public void run() {
            int partialSum = 0;
            for (int i = startIndex; i <= endIndex; i++) {
                partialSum += array[i];
            }
            partialSums[threadIndex] = partialSum;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        Thread[] threads = new Thread[5];
        int startIndex = 0;
        int endIndex = 19;

        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new SumCalculator(startIndex, endIndex, i));
            threads[i].start();

            startIndex += 20;
            endIndex += 20;
        }
        for (Thread thread : threads) {
            thread.join();
        }
        int finalSum = 0;
        for (int partialSum : partialSums) {
            finalSum += partialSum;
        }
        System.out.println("Final Sum: " + finalSum);
    }
}

