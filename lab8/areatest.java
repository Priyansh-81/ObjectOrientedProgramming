import java.util.Scanner;

abstract class Area {
    abstract void calculateArea();
}

class Rectangle extends Area {
    void calculateArea() {
        Scanner mj = new Scanner(System.in);
        double length, breadth;
        System.out.println("Enter the length of the rectangle: ");
        length = mj.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        breadth = mj.nextDouble();
        System.out.println("Area of the rectangle is " + (length * breadth));
        mj.close();
    }
}

class Circle extends Area {
    void calculateArea() {
        Scanner mj = new Scanner(System.in);
        double radius;
        System.out.println("Enter the radius of the circle: ");
        radius = mj.nextDouble();
        System.out.println("Area of the circle is " + (Math.PI * radius * radius));
        mj.close();
    }
}

public class areatest {
    public static void main(String[] args) {
        System.out.println("This program demonstrates the use of an abstract class");
        Scanner mj = new Scanner(System.in);
        System.out.println("Enter choice:\n1. Area of Rectangle\n2. Area of Circle");
        int choice = mj.nextInt();
        
        Area shape = null;
        
        switch (choice) {
            case 1:
                shape = new Rectangle();
                break;
            case 2:
                shape = new Circle();
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
