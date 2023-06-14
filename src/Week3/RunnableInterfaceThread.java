/* Write a program to create a thread by implementing Runnable interface.
Thread should print numbers from 1 to 10.*/
package Week3;
public class RunnableInterfaceThread {
        public static class numberR implements Runnable {
            public void run() {
                int i = 1;
                while (i <= 10) {
                    System.out.println(i);
                    i++;
                }
            }
        }
        public static void main(String[] args) {
            numberR r = new numberR();
            Thread t = new Thread(r);
            t.start();
        }
    }

