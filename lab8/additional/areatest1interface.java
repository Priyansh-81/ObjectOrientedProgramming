import java.util.Scanner;

interface Area {
    public void compute();    
}

class Triangle1 implements Area{
    public void compute(){
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter Base:");
        double base=mj.nextDouble();
        System.out.println("Enter Height:");
        double height=mj.nextDouble();
        System.out.println("Area of Triangle is "+(base*height*0.5));
        mj.close();
    }
}

class Square1 implements Area{
    public void compute(){
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter side:");
        double side=mj.nextDouble();
        System.out.println("Area of square is "+(side*side));
        mj.close();
    }
}
public class areatest1interface {
    public static void main(String [] args){
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter choice:\n1. Area of Triangle\n2. Area of Square");
        int ch=mj.nextInt();
        
        Area aobj=null;
        switch(ch){
            case 1:
            aobj=new Triangle1();
            break;

            case 2:
            aobj=new Square1();
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