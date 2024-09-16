class StudentData {
    int[][] subjects;
    int[] totalMarks;

    public StudentData(){
         subjects = new int[3][3];
         totalMarks = new int[3];
    }
     void Result(int[][] marks){
        int i=0 ; int j=0;
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                subjects[i][j] = marks[i][j];
            }
        }
    }

    public void CalculateTotalMarks(){
        for(int i=0; i<3; i++){
            totalMarks[i] = 0;
            for(int j=0; j<3; j++){
                totalMarks[i] +=  subjects[i][j];
            }
        }
    }

    public void HighestMarks(){
        for(int j=0; j<3; j++){
            int highest = subjects[0][j];
            int rollNo = 1;
            for(int i=0; i<3; i++){
                if(subjects[i][j]>highest){
                    subjects[i][j] = highest;
                    rollNo = i+1;
                }
            }
            System.out.println("Highest marks in subject" + j+1 + ":" + highest + "(Roll No:" + rollNo + ")");
        }
    }

    public void HighestTotalMarks(){
            int highestTotal = totalMarks[0];
            int rollNo = 1;
            for(int i=0; i<3; i++){
                if(totalMarks[i]>highestTotal){
                    totalMarks[i] = highestTotal;
                    rollNo = i+1;
                }
            }
        System.out.println("The total highest:" + highestTotal + "Roll No:" + rollNo);
    }

    public static void main(String args[]){
         int[][] marks = {
            {85,95,70},
            {73,64,83},
            {95,90,92}
         } ;
         StudentData studentdata = new StudentData();
         studentdata.Result(marks);
         studentdata.CalculateTotalMarks();
         studentdata.HighestMarks();
         studentdata.HighestTotalMarks();
    }
}
