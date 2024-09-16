import java.util.Scanner;
class elementSearchMatrix {
    static void noFound(int[][] array, int element){
        boolean flag = false;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(array[i][j] == element){
                    System.out.println("The element was found at" + i+ "," + j);
                   flag = true;
                   break;
                }
            }
            if(flag) break;
        }
        if(!flag)
        System.out.println("Element not found");
       
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[][] array = {{1,2,3,4} ,
                         {2,3,4,6},
                         {7,8,9,4}};
         System.out.println("Enter the element to be found:\n");
         int element = in.nextInt();
         noFound(array,element);
    }
}
