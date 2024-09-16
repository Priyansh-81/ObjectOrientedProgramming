// Base class
class Bike {
    int speedlimit = 90;

    void run() {
        System.out.println("Bike is running at speed limit: " + speedlimit + " km/h");
    }
}

// Derived class
class Splendar extends Bike {
    int speedlimit = 60;

    @Override
    void run() {
        System.out.println("Splendar is running at speed limit: " + speedlimit + " km/h");
    }
}

// Main class to test runtime polymorphism
public class Main {
    public static void main(String[] args) {
        // Reference variable of type Bike, object of type Bike
        Bike bike = new Bike();
        bike.run(); // Calls Bike's run method and prints Bike's speed limit

        // Reference variable of type Bike, object of type Splendar
        Bike splendar = new Splendar();
        splendar.run(); // Calls Splendar's run method and prints Splendar's speed limit

        // Trying to access the speedlimit variable using the Bike reference
        System.out.println("Speed limit accessed through Bike reference: " + splendar.speedlimit + " km/h");
    }
}