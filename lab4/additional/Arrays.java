import java.util.Scanner;
class Arrays {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first array:");
        int[] arr1 = new int[5];
        for(int i=0; i<arr1.length; i++){
            arr1[i] = in.nextInt();
        }
        System.out.println("Enter the second array:");
        int[] arr2 = new int[5];
        for(int i=0; i<arr2.length; i++){
            arr2[i] = in.nextInt();
        }

        int[] arr3 = new int[arr1.length + arr2.length];
        int index=0;

        for(int i=0; i<arr1.length; i++){
            arr3[index++] = arr1[i];
        }
        
        for(int i=0; i<arr2.length; i++){
            arr3[index++] = arr2[i];
        }

        System.out.println("The merged array is:\n");
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);
        }
    }
}
