import java.util.Scanner;

class Box{

    double width,height,depth;
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    
    double voulme(){
        return width*height*depth;
    }
}

public class BoxDemo {
    public static void main(String[] args){
        Scanner mj=new Scanner(System.in);
        double wid,hei,dep;
        System.out.println("Enter the dimentions width,height and depth");
        wid=mj.nextDouble();
        hei=mj.nextDouble();
        dep=mj.nextDouble();
        mj.close();
        Box b1=new Box(wid, hei, dep);
        double vol=b1.voulme();
        System.out.println("Voulume is "+vol);
    }
}


