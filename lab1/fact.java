import java.util.Scanner;
public class fact {
    public static void main(String args[])
    {
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial");
        int num=mj.nextInt();
        int fact=1;
        for(int i=num;i>0;i--)
        {
            fact=i*fact;
        }
        System.out.println("Factorial of "+num+" is "+fact+"\nThank You!");
        mj.close();

    }
}
//Write a Java programs to print factorial of a given no.