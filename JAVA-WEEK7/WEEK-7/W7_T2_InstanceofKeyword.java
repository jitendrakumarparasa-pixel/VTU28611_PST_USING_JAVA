import java.util.*;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class W7_T2_InstanceofKeyword {

    static String count(ArrayList myList) {

        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;

        for (Object obj : myList) {

            if (obj instanceof Student) {
                studentCount++;
            }

            if (obj instanceof Rockstar) {
                rockstarCount++;
            }

            if (obj instanceof Hacker) {
                hackerCount++;
            }
        }

        return studentCount + " " + rockstarCount + " " + hackerCount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList myList = new ArrayList();

        for (int i = 0; i < n; i++) {

            String s = sc.next();

            if (s.equals("Student")) {
                myList.add(new Student());
            }
            else if (s.equals("Rockstar")) {
                myList.add(new Rockstar());
            }
            else if (s.equals("Hacker")) {
                myList.add(new Hacker());
            }
        }

        System.out.println(count(myList));

        sc.close();
    }
}