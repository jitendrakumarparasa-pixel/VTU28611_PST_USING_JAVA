import java.util.*;

public class diagonaldifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < n; i++) {

            // Left-to-right diagonal
            primaryDiagonal += arr.get(i).get(i);

            // Right-to-left diagonal
            secondaryDiagonal += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }

    public static void main(String[] args) {11

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }

            arr.add(row);
        }

        int result = diagonalDifference(arr);

        System.out.println(result);

        sc.close();
    }
}
