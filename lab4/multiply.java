import java.util.Scanner;
public class multiply {
    public static void main(String [] args)
    {
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter the dimention of the matrix 1:");
        int m=mj.nextInt();
        int n=mj.nextInt();
        int mat[][]=new int[m][n];
        System.out.println("Enter the elements of the matrix 1\n");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter element : ("+i+","+j+")");
                mat[i][j]=mj.nextInt();
            }
        }
        System.out.println("Enter the dimention of the matrix 2:");
        int a=mj.nextInt();
        int b=mj.nextInt();
        int mt[][]=new int[a][b];
        System.out.println("Enter the elements of the matrix 2\n");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.println("Enter element : ("+i+","+j+")");
                mt[i][j]=mj.nextInt();
            }
        }
        int mul[][]=new int[m][b];
        int sum[][]=new int[m][b];
        mj.close();

        if(a!=m && b!=n){
            System.out.println("Sum is not possible");
        }
        else
        {
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    sum[i][j]=mat[i][j]+mt[i][j];
                }
            }
        }
        if(n!=a){
            System.out.println("Multiplication not possible");
        }
        else{
            for(int i=0;i<m;i++){
                for(int j=0;j<b;j++){
                    mul[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        mul[i][j] += mat[i][k] * mt[k][j];
                }
                }
            }
        }
        System.out.println("Sum is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<b;j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("mul is :");
        for(int i=0;i<m;i++){
            for(int j=0;j<b;j++){
                System.out.print(mul[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
