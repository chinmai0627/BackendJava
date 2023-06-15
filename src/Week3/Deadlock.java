/*Write a Java program to create deadlocks between two threads.*/
package Week3;

public class Deadlock {
        public static void main(String[] args) {
            final String resource1 = "Printer";
            final String resource2 = "Paper";

            Thread thread1 = new Thread(() -> {
                synchronized (resource1) {
                    System.out.println("Thread 1 acquired the Printer");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Thread 1 waiting to get Paper");

                    synchronized (resource2) {
                        System.out.println("Thread 1 acquired the Paper");
                    }
                }
            });

            Thread thread2 = new Thread(() -> {
                synchronized (resource2) {
                    System.out.println("Thread 2 acquired the Paper");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Thread 2 waiting to get Printer");

                    synchronized (resource1) {
                        System.out.println("Thread 2 acquired the Printer");
                    }
                }
            });

            thread1.start();
            thread2.start();
        }
    }


