import java.util.Scanner;
public class BankDemo {
    public static void main(String[] args){
        double princ,result;
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        princ=mj.nextDouble();
        System.out.println("Enter the choice\n1.SBI\n2.ICIC\n3.AXIS");
        int ch;
        ch=mj.nextInt();
        mj.close();
        Bank obj;
        switch(ch){
            case 1:
            obj=new SBI();
            break;
            case 2:
            obj=new ICIC();
            break;
            case 3:
            obj=new AXIS();
            break;
            default:
            obj=new Bank();
        }
        result=princ+princ*(obj.getRateofInterest())/100;
        System.out.println("Amount after interest is "+result);
    }
}
class Bank{
    int getRateofInterest(){
        return 0;
    }
}
class SBI extends Bank{
    int getRateofInterest(){
        return 8;
    }
}
class AXIS extends Bank{
    int getRateofInterest(){
        return 9;
    }
}
class ICIC extends Bank{
    int getRateofInterest(){
        return 7;
    }
}