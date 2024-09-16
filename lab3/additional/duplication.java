import java.util.Scanner;
class duplication {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] digits = {1,2,3,4};
        System.out.println("All combinations with repetion:\n");
        for(int i=0; i<digits.length; i++){
            for(int j=0; j<digits.length; j++){
                for(int k=0; k<digits.length; k++){
                    for(int l=0; l<digits.length; l++){
                        System.out.println("" + digits[i] + digits[j] + digits[k] + digits[l]);
                    }
                }
            }
        }
    }
}
