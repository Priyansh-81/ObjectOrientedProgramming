import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner mj=new Scanner(System.in);
        char o;
        float a,b;
        System.out.println("Enter @ to exit!");
        do{
            System.out.println("Enter the first number : ");
            a=mj.nextFloat();
            System.out.println("Enter the operator: ");
            o=mj.next().charAt(0);
            System.out.println("Enter the second number : ");
            b=mj.nextFloat();
            if(o=='@'){
                break;
            }
            switch(o){
                case '+':
                System.out.println("Sum is "+(a+b));
                break;
                case '-':
                System.out.println("Difference is "+(a-b));
                break;
                case '*':
                System.out.println("Product is "+(a*b));
                break;
                case '/':
                System.out.println("Quotient is "+(a/b));
                break;
                default:
                System.out.println("Invalid operator(@ to quit)");
                break;
            }

        }while(true);
        mj.close();
        System.out.println("\nThank You!");
    }
}
