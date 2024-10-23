import java.util.Scanner;

// Thread using Runnable interface
class RunnableThread implements Runnable {

    public void run() {
        System.out.println(
            "Thread created using Runnable interface is running..."
        );
    }
}

// Thread using Thread class
class ExtendedThread extends Thread {

    public void run() {
        System.out.println(
            "Thread created by extending Thread class is running..."
        );
    }
}

public class q1Thread {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Create Thread using Runnable interface");
            System.out.println("2. Create Thread by extending Thread class");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Creating a thread using Runnable interface
                    RunnableThread runnableThread = new RunnableThread();
                    Thread thread1 = new Thread(runnableThread);
                    thread1.start();
                    break;
                case 2:
                    // Creating a thread by extending Thread class
                    ExtendedThread extendedThread = new ExtendedThread();
                    extendedThread.start();
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}
