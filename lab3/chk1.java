import java.util.*;

public class chk1 {
    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);
        System.out.println("Enter the range m and n to check for prime numbers:");
        int m = mj.nextInt();
        int n = mj.nextInt();
        
        if (m < 2) {
            m = 2;
        }

        for (int i = m; i <= n; i++) {
            boolean isPrime = true;
            if (i == 2) {
                isPrime = true;
            } else if (i % 2 == 0) {
                isPrime = false;
            } else {
                for (int j = 3; j * j <= i; j += 2) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(i + "\t");
            }
        }
        
        mj.close();
        System.out.println("\nThank You!");
    }
}

