import java.util.Scanner;

abstract class Area {
    abstract void calculateArea();
}

class Triangle extends Area {
    void calculateArea() {
        Scanner mj = new Scanner(System.in);
        double base, height;
        System.out.println("Enter the base of the triangle: ");
        base = mj.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        height = mj.nextDouble();
        System.out.println("Area of the rectangle is " + (base * height*1/2));
        mj.close();
    }
}

class Square extends Area {
    void calculateArea() {
        Scanner mj = new Scanner(System.in);
        double side;
        System.out.println("Enter the side of square: ");
        side = mj.nextDouble();
        System.out.println("Area of the square is " + (side*side));
        mj.close();
    }
}

public class area1cal{
    public static void main(String[] args) {
        System.out.println("This program demonstrates the use of an abstract class");
        Scanner mj = new Scanner(System.in);
        System.out.println("Enter choice:\n1. Area of Triangle\n2. Area of Square");
        int choice = mj.nextInt();
        
        Area shape = null;
        
        switch (choice) {
            case 1:
                shape = new Triangle();
                break;
            case 2:
                shape = new Square();
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        
        if (shape != null) {
            shape.calculateArea(); 
        }
        mj.close();
    }
}
