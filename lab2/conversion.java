import java.util.Scanner;


public class conversion {
    public static void main(String args[]){
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter an integer");
        int a=mj.nextInt();
        System.out.println("Enter a double ");
        double b=mj.nextDouble();
        System.out.println("Enter a character");
        char c=mj.next().charAt(0);
        byte x=(byte)a;
        System.out.println("int to byte\t"+x);
        byte y=(byte)b;
        System.out.println("double to byte\t"+y);
        int w=(int)c;
        System.out.println("char to int\t"+w);
        int z=(int)b;
        System.out.println("double to int\t"+z);
        mj.close();

    }
}
