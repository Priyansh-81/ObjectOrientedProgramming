import java.util.Scanner;
public class sumprinc{
    public static void main(String[] args){
        Scanner mj=new Scanner(System.in);
        //Write a Java program to display principal diagonal elements and find their sum. [Hint: 
        //Principal Diagonal
        System.out.println("Enter the dimetions of the square matrix");
        int n=mj.nextInt();
        int mat[][]=new int[n][n];
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter element : ("+i+","+j+")");
                mat[i][j]=mj.nextInt();
            }
        }
        int sum=0;
        mj.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum=sum+mat[i][j];
                }
            }
        }
        System.out.println("The sum of elements priciple diagonal is "+sum);
        System.out.println("Thank You!");
    }
}