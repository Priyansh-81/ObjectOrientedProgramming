import java.util.Scanner;
public class palin {
    public static void main(String args[])
    {
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome\n");
        int num=mj.nextInt();
        int rum=num;
        int check=0;
        while(rum!=0)
        {
            check=check*10+rum%10;
            rum=rum/10;
        }
        if(num==check){
            System.out.println(num+ " is palindrome");
        }
        else
        {
            System.out.println(num+" is not palindrome");
        }
        System.out.println("Thank You!");
        mj.close();
    }
}

//Write a program to check whether a number is palindrome or not
