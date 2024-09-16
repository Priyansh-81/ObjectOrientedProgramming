import java.util.Scanner;

public class Area{
	public static void main(String args[])
		{
			Scanner mj= new Scanner(System.in);
			System.out.println("Enter the length");
			int l=mj.nextInt();
			System.out.println("Enter the breath");
			int b=mj.nextInt();
			System.out.println("Area is "+l*b);
			System.out.println("Circumference is "+2*(l+b));
			mj.close();
		}
}
//Write a Java program to find area and circumference of a rectangle. 