public class complexDemo{
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);  // 2 + 3i
        Complex c2 = new Complex(4, 5);  // 4 + 5i

        // Adding an integer to a complex number
        Complex result1 = c1.add(5);
        System.out.println("Result of adding an integer: " + result1.real+"+"+result1.imag+"i");  // Output: 7.0 + 3.0i

        // Adding two complex numbers
        Complex result2 = c1.add(c2);
        System.out.println("Result of adding two complex numbers: " + result2.real+"+"+result2.imag+"i"); 
}
}

class Complex {
    double real;
    double imag;

    // Constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add an integer to a complex number
    Complex add(int value) {
        return new Complex(this.real + value, this.imag);
    }

    // Method to add a complex number to another complex number
    Complex add(Complex c2) {
        return new Complex(this.real + c2.real, this.imag + c2.imag);
    }

}