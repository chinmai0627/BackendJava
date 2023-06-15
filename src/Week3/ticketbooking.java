/*Create a Java program that simulates a ticket booking system
with multiple threads. Implement synchronization mechanisms to ensure that
only one thread can access and book a ticket at a time. */
package Week3;
public class ticketbooking {
        private static int availableSeats = 10;
        private static synchronized boolean bookTicket(int numSeats) {
            if (availableSeats >= numSeats) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                availableSeats -= numSeats;
                return true;
            }
            return false;
        }
        public static class BookingThread extends Thread {
            private int numSeats;
            private String name;
            public BookingThread(String name, int numSeats) {
                this.name = name;
                this.numSeats = numSeats;
            }
            @Override
            public void run() {
                if (bookTicket(numSeats)) {
                    System.out.println(name + " booked " + numSeats + " ticket(s).");
                } else {
                    System.out.println(name + " failed to book " + numSeats + " ticket(s).");
                }
            }
        }
        public static void main(String[] args) {
            BookingThread thread1 = new BookingThread("Thread 1", 3);
            BookingThread thread2 = new BookingThread("Thread 2", 5);
            BookingThread thread3 = new BookingThread("Thread 3", 4);

            thread1.start();
            thread2.start();
            thread3.start();
        }
    }


