import java.util.*;

class Ride {
    double calculateFare(double distance) {
        return 0;
    }
}

class Bike extends Ride {
    double calculateFare(double distance) {
        return distance * 5;
    }
}

class Auto extends Ride {
    double calculateFare(double distance) {
        return distance * 12;
    }
}

class Cab extends Ride {
    double calculateFare(double distance) {
        return distance * 12;
    }
}

public class SYLLABUS_TASK6_RideSharingPlatformSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double distance = sc.nextDouble();

            try {
                Ride ride;

                if (type.equals("Bike")) {
                    ride = new Bike();
                } else if (type.equals("Auto")) {
                    ride = new Auto();
                } else if (type.equals("Cab")) {
                    ride = new Cab();
                } else {
                    throw new Exception("Invalid ride");
                }

                System.out.println((int) ride.calculateFare(distance));

            } catch (Exception e) {
                System.out.println("Invalid Booking");
            }
        }
    }
}