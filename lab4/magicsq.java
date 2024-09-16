import java.util.Scanner;

public class magicsq {
    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);
        // magic square
        System.out.println("Enter the dimensions of the square matrix");
        int n = mj.nextInt();
        int mat[][] = new int[n][n];
        
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element : (" + i + "," + j + ")");
                mat[i][j] = mj.nextInt();
            }
        }
        mj.close();
        
        // Calculate the sum of the first row to use as the magic constant
        int magicSum = 0;
        for (int j = 0; j < n; j++) {
            magicSum += mat[0][j];
        }

        // Check sum of rows
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += mat[i][j];
            }
            if (rowSum != magicSum) {
                System.out.println("Not a magic square.");
                return;
            }
        }

        // Check sum of columns
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += mat[i][j];
            }
            if (colSum != magicSum) {
                System.out.println("Not a magic square.");
                return;
            }
        }

        // Check sum of principal diagonal
        int princSum = 0;
        for (int i = 0; i < n; i++) {
            princSum += mat[i][i];
        }
        if (princSum != magicSum) {
            System.out.println("Not a magic square.");
            return;
        }

        // Check sum of secondary diagonal
        int secDiagSum = 0;
        for (int i = 0; i < n; i++) {
            secDiagSum += mat[i][n - i - 1];
        }
        if (secDiagSum != magicSum) {
            System.out.println("Not a magic square.");
            return;
        }

        // If all checks passed
        System.out.println("The matrix is a magic square.");
    }
}
