class CountingThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Counting: " + i);
            try {
                // Sleep for 1 second to simulate some work
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}

public class Q3ThreadStatus {

    public static void main(String[] args) {
        // Create an instance of the CountingThread
        CountingThread countingThread = new CountingThread();

        // Start the thread
        System.out.println("Starting the counting thread.");
        countingThread.start();

        // Check if the thread is alive
        System.out.println("Is the thread alive? " + countingThread.isAlive());

        // Wait for the thread to complete using join()
        System.out.println("Waiting for the thread to finish...");
        try {
            countingThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        // Check if the thread is alive after joining
        System.out.println("Is the thread alive? " + countingThread.isAlive());
        System.out.println("Counting thread has finished.");
    }
}
