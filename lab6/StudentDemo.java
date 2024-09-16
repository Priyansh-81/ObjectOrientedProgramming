import java.util.Scanner;
public class StudentDemo{
    public static void main(String[] args){
        UG stud1=new UG();
        UG stud11=new UG();
        PG stud2=new PG();
        PG stud22=new PG();

        stud1.display();
        stud11.display();
        stud2.display();
        stud22.display();

    System.out.println("Total number of UG admissions: "+UG.totalUG);
    System.out.println("Totla number of PG admissions: "+PG.totalPG);
    System.out.println("Total number of admissions are: "+(UG.totalUG+PG.totalPG));
    }
}

class student{
    int reg;
    String Name;
    int age;

    student(){
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter reginsteration number:");
        reg=mj.nextInt();
        System.out.println("Enter Name:");
        Name=mj.next();
        System.out.println("Enter age:");
        age=mj.nextInt();

    }
}

class UG extends student{//here ug is inheriting the class student
    int semester,fees;
    static int totalUG=0;
    UG(){
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter semester:");
        semester=mj.nextInt();
        System.out.println("Enter fees:");
        fees=mj.nextInt();
        totalUG++;
        //mj.close();
    }
    void display(){
        System.out.println("Registeration Number :"+reg);//inherited
        System.out.println("Name :"+Name);//inherited
        System.out.println("Age :"+age);//inherited
        System.out.println("Semester :"+semester);
        System.out.println("Fees :"+fees);
        System.out.println();
    }
}

class PG extends student{
    int semester,fees;
    static int totalPG=0;
    PG(){
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter semester:");
        semester=mj.nextInt();
        System.out.println("Enter fees:");
        fees=mj.nextInt();
        totalPG++;
        //mj.close();
    }
    void display(){
        System.out.println("Registeration Number :"+reg);
        System.out.println("Name :"+Name);
        System.out.println("Age :"+age);
        System.out.println("Semester :"+semester);
        System.out.println("Fees :"+fees);
        System.out.println();
    }
}