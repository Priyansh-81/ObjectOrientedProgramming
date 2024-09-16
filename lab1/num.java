import java.util.Scanner;

public class num{
    public static void main(String args[])
    {
        System.out.println("Enter 10 elements");
        Scanner mj= new Scanner(System.in);
        int pos=0,neg=0,zer=0;
        for(int i=0;i<10;i++)
        {
            int x=mj.nextInt();
            if(x>0)
            {
                pos++;
            }
            else if(x<0)
            {
                neg++;
            }
            else
            {
                zer++;
            }
        }
        System.out.println("There are "+pos+" positive numbers, "+neg+" negative numbers, "+zer+" zeroes.\nThank You!");
        mj.close();
    }
}

/*Write a Java program to enter 10 numbers and display the number of 
positive,negative and zeros number.  */