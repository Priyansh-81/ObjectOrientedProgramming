import java.util.Scanner;

interface Area {
    public void compute();    
}

class rectangle1 implements Area{
    public void compute(){
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter Length:");
        double len=mj.nextDouble();
        System.out.println("Enter Breath:");
        double br=mj.nextDouble();
        System.out.println("Area of rectangle is "+(len*br));
        mj.close();
    }
}

class circle1 implements Area{
    public void compute(){
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter Radius:");
        double rad=mj.nextDouble();
        System.out.println("Area of circle is "+(Math.PI*rad*rad));
        mj.close();
    }
}
public class areatestinterface {
    public static void main(String [] args){
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter choice:\n1. Area of Rectangle\n2. Area of Circle");
        int ch=mj.nextInt();
        
        Area aobj=null;
        switch(ch){
            case 1:
            aobj=new rectangle1();
            break;

            case 2:
            aobj=new circle1();
            break;

            default:
            System.out.println("Invalid choice!");
            break;
        }
        if(aobj!=null)
            aobj.compute();
        mj.close();
    }
}