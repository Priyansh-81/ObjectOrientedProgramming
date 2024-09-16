import java.util.Scanner;
class SumSeries {
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the number of terms in the series:\n");
       int n = in.nextInt();
       double sum = 0;
       for(int i=1; i<=n; i++){
           sum += Math.pow(1.0/i , i);
       }
       System.out.println("The sum of the series:" + sum);
    }
}
