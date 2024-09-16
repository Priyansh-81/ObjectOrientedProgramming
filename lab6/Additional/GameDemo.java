import java.util.Scanner;

public class GameDemo {
    //demonstrating dynamic method dispatch
    public static void main(String [] args){
        System.out.println("Enter the choice\n1.Cricket\n2.Chess");
        Scanner mj=new Scanner(System.in);
        int ch=mj.nextInt();
        mj.close();
        Game obj;
        switch(ch){
            case 1:
                obj=new Cricket();
                break;
            case 2:
                obj=new Chess();
                break;
            default:
                obj=new Game();
                break;
        }
        obj.type();
    }
}


class Game{
    void type(){
        System.out.println("Indoor and outdoor games");
    }
}

class Cricket extends Game{
    void type(){
        System.out.println("Cricket is an outdoor game");
    }
}

class Chess extends Game{
    void type(){
        System.out.println("Chess is an indoor game");
    }
}
/*Create a base class “Game” with method called “type” that prints “indoor & outdoor games”.
Create a subclass cricket with a method called “type” that prints “cricket is an outdoor game”.
Create one more subclass of “Game” called “chess” with a method “type” that prints “chess
is an indoor game”. Write a complete Java program for the above, to understand the Dynamic
method dispatch concept. */