import java.util.Scanner;

public class pattern{
    public static void main(String [] args)
    {
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter the dimentions of the pattern :");
        int n=mj.nextInt();
        //using for loop
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.print("\n");
        }
        //using for each loop
        //Create an array to store numbers 1 to n
        int[] numbers = new int[n];
        for (int i = 1; i <= n; i++) {
            numbers[i - 1] = i;
        }
        for (int num : numbers) {
            for (int j = 1; j <= num; j++) {
                System.out.print(num);
            }
            System.out.print("\n");
        }
        mj.close();
    }
}
