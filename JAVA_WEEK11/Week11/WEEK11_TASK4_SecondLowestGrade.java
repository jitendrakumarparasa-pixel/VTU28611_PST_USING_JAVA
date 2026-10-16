import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WEEK11_TASK4_SecondLowestGrade {
    public static void printSecondLowestGrade(String[][] students) {
        List<Integer> grades = new ArrayList<>();
        for (String[] student : students) {
            grades.add(Integer.parseInt(student[1]));
        }

        Collections.sort(grades);

        int secondLowest = -1;
        for (int i = 1; i < grades.size(); i++) {
            if (!grades.get(i).equals(grades.get(i - 1))) {
                secondLowest = grades.get(i);
                break;
            }
        }

        List<String> names = new ArrayList<>();
        for (String[] student : students) {
            if (Integer.parseInt(student[1]) == secondLowest) {
                names.add(student[0]);
            }
        }

        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        String[][] students = {
                {"Harry", "37"},
                {"Berry", "37"},
                {"Tina", "68"},
                {"Akriti", "41"},
                {"Harsh", "39"},
                {"Cass", "41"},
                {"Larry", "48"}
        };

        System.out.println("Students with second lowest grade:");
        printSecondLowestGrade(students);
    }
}
