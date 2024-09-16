public class questionfour {
    public static void main(String[] args){
        int x=10;
        double y=x;
        System.out.println(y);//implicit conversion

        double X=10.5;
        int Y=X;
        System.out.println(Y);//implicit conversion not allowed because int is smaller than double
        *
        double XX=10.5;
        int YY=(int)XX;
        System.out.println(YY);//explicitly converting to int

    }
}
