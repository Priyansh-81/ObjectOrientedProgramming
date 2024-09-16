import java.util.Scanner;
public class bitwise {
    public static void main(String[] args){
        Scanner mj=new Scanner(System.in);
        int a;
        System.out.println("Enter the number!");
        a=mj.nextInt();
        int div=a>>1;
        int mul=a<<1;
        System.out.println("Product with 2 is "+mul+" while the quotient is "+div);
        System.out.println("Thank You!");
        mj.close();
    }
}
