interface sports {
    public int getNumberOfGoals();
    public void dispTeam();
}

class hockey implements sports{
    public int getNumberOfGoals(){
        return 16;
    }
    public void dispTeam(){
        System.out.println("1.m1\n2.m2\n3.m3\n4.m4\n5.m5\n6.m6");
    }
}

class footballs implements sports{
    public int getNumberOfGoals(){
        return 3;
    }
    public void dispTeam(){
        System.out.println("1.f1\n2.f2\n3.f3\n4.f4\n5.f5\n6.f6");
    }
}

public class sportsdemo{
    public static void main(String [] args){
        System.out.println("Demonstration of interface concept");
        sports obj1=new hockey();
        sports obj2=new footballs();
        System.out.println("Printing for hockey");
        obj1.dispTeam();//display team fuction
        System.out.println("Number of goals are "+obj1.getNumberOfGoals());//display the number of goals for hockey
        System.out.println("\nPrinting for football");
        obj1.dispTeam();//display team fuction
        System.out.println("Number of goals are "+obj2.getNumberOfGoals());//display the number of goals for football
    }
}
