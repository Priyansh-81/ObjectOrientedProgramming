import java.util.Scanner;
class Expressions {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a:\n");
        int a = in.nextInt();
        System.out.println("Enter the value of b:\n");
        int b = in.nextInt();
        System.out.println("Enter you choice:\n");
        int x = in.nextInt();
        switch(x){
            case 1:
            int r1 = ((a<<2) + (b>>2));
            System.out.println(r1);
            break;
           
            case 2:
            boolean r2 = b>0;
            System.out.println(r2);
            break;

            case 3:
            float r3 =	(a + b * 100) / 10;
            System.out.println(r3);
            break;

            case 4:
            int r4 =a & b;
            System.out.println(r4);
            break;

        }
    
    }

}
