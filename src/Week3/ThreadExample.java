package Week3;
public class ThreadExample {
    public static class numbert extends Thread {
        public void run() {
            int i = 1;
            while (i <= 10) {
                System.out.println(i);
                i++;
            }
        }
    }
    public static void main(String[] args) {
        numbert t = new numbert();
        t.start();
    }
}
