import java.util.*;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

public class SYLLABUS_TASK9_CalculatorUnitTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String operator = sc.next();
        int b = sc.nextInt();

        Calculator c = new Calculator();

        try {
            int result;

            if (operator.equals("+")) {
                result = c.add(a, b);

                if (result == a + b) {
                    System.out.println("Test Passed");
                } else {
                    System.out.println("Test Failed");
                }

            } else if (operator.equals("/")) {
                result = c.divide(a, b);

                if (result == a / b) {
                    System.out.println("Test Passed");
                } else {
                    System.out.println("Test Failed");
                }
            }

        } catch (Exception e) {
            System.out.println("Test Failed");
        }
    }
}