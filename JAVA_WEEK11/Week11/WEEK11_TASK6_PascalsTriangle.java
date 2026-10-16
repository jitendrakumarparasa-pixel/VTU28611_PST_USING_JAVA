import java.util.ArrayList;
import java.util.List;

public class WEEK11_TASK6_PascalsTriangle {
    public static List<List<Integer>> generate(int rows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int rows = 5;
        List<List<Integer>> triangle = generate(rows);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
