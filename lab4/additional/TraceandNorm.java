class TraceandNorm {
    static void Trace(int[][] matrix){
        int T =0;
        for(int i=0; i<matrix.length; i++){
                  T += matrix[i][i];
            }
        
        System.out.println("The Trace of the matrix is:\n" + T);
    }

    static void Norm(int[][] matrix){
        int SumofSquares=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
               SumofSquares += matrix[i][j]*matrix[i][j];
            }
        }
        double norm = Math.sqrt(SumofSquares);
        System.out.println("The Norm of the matrix is:\n" + norm);
    }
    public static void main(String args[]){
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}}; 
                          Trace(matrix);
                          Norm(matrix);
    }
}
