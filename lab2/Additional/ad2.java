import java.util.Scanner;

public class ad2 {
    public static void main(String args[]){
        int a,b,c;
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter three numbers to compare:\n");
        a=mj.nextInt();
        b=mj.nextInt();
        c=mj.nextInt();
        mj.close();
        int largest=(a>b)?(a>c?a:c):(b>c?b:c);
        int smallest=(a<b)?(a<c?a:c):(b<c?b:c);
        System.out.println(largest+" is the largest number while "+smallest+ " is the smallest number.");
        mj.close();
    }
}
