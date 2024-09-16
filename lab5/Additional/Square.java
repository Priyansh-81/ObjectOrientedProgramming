class Square {
    public int square(int num){
         return num * num;
    }

    public float square(float num){
        return num * num;
    }

    public static void main(String args[]){
        Square sq = new Square();
        int intresult = sq.square(3);
        System.out.println("The square of 3 is:" + intresult);
        float floatresult = sq.square(0.2);
        System.out.println("The square of 0.2 is:" + floatresult);
    }
}
   
