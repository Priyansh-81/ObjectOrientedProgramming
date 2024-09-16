import java.util.Scanner;
class ArrayInput{
    public static void displayLargest(int[] arr){
        int Largest = arr[0];
       for(int i=1; i<arr.length; i++){
        if(arr[i]>Largest){
            Largest = arr[i] ;
        }
    }
        System.out.println("The largest number is:" + Largest);
       
    }

    public static void Average(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        double Average = sum/ (double) arr.length;
            System.out.println("The average of the data is:" + Average);
        
    }

     public static void Sort(int[] arr){
        int temp=0;
       for(int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-i-1; j++){
        if(arr[j]>arr[j+1]){
             temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}
for(int i=0; i<arr.length; i++){
    System.out.println(arr[i]);
}
System.out.println();
     }
    public static void main(String args[]){
          Scanner in = new Scanner(System.in);
          int[] arr = new int[10];
          System.out.println("Enter the element of array:\n");
          for(int i=0; i<arr.length; i++){
          arr[i] = in.nextInt();
          }
         displayLargest(arr);
          Average(arr);
          Sort(arr);
    }

    }
