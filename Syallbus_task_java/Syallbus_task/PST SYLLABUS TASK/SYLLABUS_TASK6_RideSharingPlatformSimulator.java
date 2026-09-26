import java.util.Scanner;

abstract class Vehicle {
    abstract double calculateFare(double distance);
}

class Bike extends Vehicle {
    double calculateFare(double distance) {
        return distance * 5;
    }
}

class Auto extends Vehicle {
    double calculateFare(double distance) {
        return distance * 12;
    }
}

class Cab extends Vehicle {
    double calculateFare(double distance) {
        return distance * 12;
    }
}

class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }
}

class Rider {
    String name;

    Rider(String name) {
        this.name = name;
    }
}

class Trip {
    Vehicle vehicle;
    double distance;

    Trip(Vehicle vehicle, double distance) {
        if (distance <= 0) {
            throw new IllegalArgumentException("Invalid distance");
        }

        this.vehicle = vehicle;
        this.distance = distance;
    }

    double getFare() {
        return vehicle.calculateFare(distance);
    }
}

public class STASK6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            double distance = sc.nextDouble();

            try {
                Vehicle vehicle;

                if (type.equalsIgnoreCase("Bike")) {
                    vehicle = new Bike();
                } else if (type.equalsIgnoreCase("Auto")) {
                    vehicle = new Auto();
                } else if (type.equalsIgnoreCase("Cab")) {
                    vehicle = new Cab();
                } else {
                    throw new IllegalArgumentException("Invalid ride type");
                }

                Trip trip = new Trip(vehicle, distance);

                double fare = trip.getFare();

                if (fare == (long) fare) {
                    System.out.println((long) fare);
                } else {
                    System.out.println(fare);
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Booking");
            }
        }

        sc.close();
    }
}
