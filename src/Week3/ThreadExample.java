package Week3;
public class ThreadExample {
    public static class numbert extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        numbert t = new numbert();
        t.start();
    }
}
