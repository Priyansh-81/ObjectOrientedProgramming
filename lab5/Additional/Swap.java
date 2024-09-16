class Swap {
    static void swapByValue(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped values by call by value are:" + a + "and " + b);
    }

    static void swapByReference(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println("The swapped values by call by reference are:" + arr[0] + "and " + arr[1]);
    }
    
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        System.out.println("Values before swapping by call by value:" + a + "and " + b);
        swapByValue(a,b);
        System.out.println("Values after swapping:" + a + "and " + b);

        int[] arr = {5,10};
        System.out.println("Values before swapping by call by reference:" + arr[0] + "and " + arr[1]);
        swapByReference(arr);
        System.out.println("Values after swapping:" + arr[0] + "and " + arr[1]);
    }
}
