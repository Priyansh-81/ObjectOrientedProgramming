import java.util.Scanner;
class SineSeries {
    static int factorial(int n){
        int fact =1;
        for(int i=2; i<=n; i++){
            fact = fact *i;
        }
        return fact;
    }
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the value of x in radians:\n");
       double x = in.nextDouble();
       System.out.println("Enter the number of terms:\n");
       int n= in.nextInt();
       double sinx = 0;
       for(int i=0; i<n; i++){
        int sign = (i%2==0)?1:-1;
        int power = 2 * i +1;
        sinx+= sign * Math.pow(x,power)/ factorial(power);
       }
       System.out.println("The value of Sin(" + x + ") using" + n + "terms is: " + sinx);
    }
}
