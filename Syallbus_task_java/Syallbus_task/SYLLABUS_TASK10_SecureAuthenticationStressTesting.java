import java.util.*;

public class SYLLABUS_TASK10_SecureAuthenticationStressTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String username = sc.next();
            String password = sc.next();

            boolean valid = true;

            if (username.length() < 3 || username.length() > 20) {
                valid = false;
            }

            if (password.length() < 6 || password.length() > 20) {
                valid = false;
            }

            if (username.equals("admin") && password.equals("admin123")) {
                valid = true;
            } else if (!username.equals("admin")) {
                valid = false;
            }

            if (valid) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILURE");
            }
        }
    }
}