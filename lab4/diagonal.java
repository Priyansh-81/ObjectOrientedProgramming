import java.util.Scanner;

public class diagonal{
    public static void main(String [] args)
    {
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter the dimention of the square matrix:");
        int n=mj.nextInt();
        int mat[][]=new int[n][n];
        System.out.println("Enter the elements of the matrix\n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter element : ("+i+","+j+")");
                mat[i][j]=mj.nextInt();
            }
        }
        mj.close();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || i==n-j-1 )
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print(mat[i][j]);
                    sum+=mat[i][j];
                }
            }
            System.out.print("\n");
        }
        System.out.println("Sum of non diagonal elements is "+ sum);
    }
}

