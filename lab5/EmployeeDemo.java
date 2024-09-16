import java.util.Scanner;
public class EmployeeDemo {
    public static void main(String[] args){
        Employee emp=new Employee();
        emp.getData();
        emp.calculate();
        emp.display();
    }
}
class Employee{
    int da;
    int hra;
    String Name;
    String city;
    int sal;
    void getData(){
        System.out.println("Enter the name");
        Scanner mj=new Scanner(System.in);
        Name=mj.next();
        System.out.println("Enter the city");
        city=mj.next();
        System.out.println("Enter basic salary:");
        sal=mj.nextInt();
        System.out.println("Enter DA");
        da=mj.nextInt();
        System.out.println("Enter HRA");
        hra=mj.nextInt();
        mj.close();
    }
    int calculate(){
        int total;
        total=sal+sal*da/100+sal*hra/100;
        return total;
    }
    void display(){
        System.out.println("Name is "+Name);
        System.out.println("City is "+city);
        System.out.println("Basic Salary is "+sal);
        System.out.println("DA is "+da);
        System.out.println("HRA is "+hra);
        System.out.println("Net salary is "+calculate());
    }
}