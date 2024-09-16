import java.util.Scanner;
class Analyze {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of x:\n");
        int x = in.nextInt();
        System.out.println("Enter the value of y:\n");
        int y= in.nextInt();
        System.out.println("Enter your choice:\n");
        int a = in.nextInt();
        
        switch(a){
            case 1:
            boolean x = true;
            int y = x;
            System.out.println(y);
            break;

            case 2:
            boolean x = true;
            int y = (int)x;
            System.out.println(y);
            break;

        }
    }
}
