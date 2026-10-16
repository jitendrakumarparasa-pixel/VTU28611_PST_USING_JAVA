public class WEEK11_TASK9_MigratoryBirds {
    public static int migratoryBirds(int[] birds) {
        int[] counts = new int[6];

        for (int bird : birds) {
            counts[bird]++;
        }

        int bestBird = 1;
        int maxCount = counts[1];

        for (int i = 2; i <= 5; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                bestBird = i;
            }
        }

        return bestBird;
    }

    public static void main(String[] args) {
        int[] birds = {1, 4, 4, 4, 5, 3};
        System.out.println("Most common bird: " + migratoryBirds(birds));
    }
}
