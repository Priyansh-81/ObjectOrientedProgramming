import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachLoopExample {
    public static void main(String[] args) {
        List<int[]> rows = new ArrayList<>();

        
        for (int i = 1; i <= 5; i++) {
            int[] row = new int[i];
            Arrays.fill(row, i);
            rows.add(row);
        }

        
        for (int[] row : rows) {
            for (int num : row) {
                System.out.print(num + " ");
            }
     system.out.println();
        }}}