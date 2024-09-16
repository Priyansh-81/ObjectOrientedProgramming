import java.util.Scanner;
public class table {
    public static void main(String args[])
    {
        System.out.println("Enter the number to print its table");
        Scanner mj=new Scanner(System.in);
        int num=mj.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
        mj.close();
        System.out.println("Thank You!");
    }
}
//Write a Java program to print table of number entered by user 