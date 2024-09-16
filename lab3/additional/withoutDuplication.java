import java.util.Scanner;
class withoutDuplication{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] digits = {1,2,3,4};
        System.out.println("The combinations without any repetitions:\n");
        for(int i=0; i<digits.length; i++){
            for(int j=0; j<digits.length; j++){
                if (i==j) continue;
                for(int k=0; k<digits.length; k++){
                    if(k==i || k==j) continue;
                    for(int l=0; l<digits.length; l++){
                        if(l==k || l==i || l==j) continue;
                        System.out.println(" " + digits[i] + digits[j] + digits[k] + digits[l]);
                    }
                }
            }
        }
    }
}