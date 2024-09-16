import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=mj.nextInt();
        mj.close();
        int rum=num;
        int rev=0;
        while(rum>0){
            rev=rev*10+rum%10;
            rum=rum/10;
        }

        if(num==rev){
            System.out.println(num+" is palindrome!");
        }
        else{
            System.out.println(num+" is not palindrome!");
        }
    }
}
