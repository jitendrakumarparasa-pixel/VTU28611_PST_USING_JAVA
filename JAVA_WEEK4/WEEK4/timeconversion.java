import java.util.*;

public class timeconversion {

    public static String timeConversion(String s) {

        int hour = Integer.parseInt(s.substring(0, 2));
        String ampm = s.substring(8, 10);

        if (ampm.equals("AM") && hour == 12) {
            hour = 0;
        } 
        else if (ampm.equals("PM") && hour != 12) {
            hour = hour + 12;
        }

        return String.format("%02d", hour) + s.substring(2, 8);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(timeConversion(s));
    }
}