import java.util.Scanner;

public class symmetric {
    public static void main(String[] args){
        Scanner mj=new Scanner(System.in);
        
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
        mj.close();
        int trans[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                trans[j][i]=mat[i][j];
            }
        }
        int tr=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(trans[i][j]!=mat[i][j])
                {
                    tr=0;
                }
            }
        }
        if(tr==1){
            System.out.println("Its symmetric");
        }
        else
        {
            System.out.println("not symmetric");
        }
        //Find whether a given matrix is symmetric or not
    }
}
