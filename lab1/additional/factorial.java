import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        System.out.println("Enter a number to calculate its factorial");
        int a;
        Scanner mj=new Scanner(System.in);
        a=mj.nextInt();
        mj.close();
        calculate obj=new calculate();
        System.out.println("Factorial is "+obj.fact(a));

    }
}

class calculate{
    int fact(int a){
        if(a==0|a==1)
            return 1;
        else
            return a*fact(a-1);
    }
}