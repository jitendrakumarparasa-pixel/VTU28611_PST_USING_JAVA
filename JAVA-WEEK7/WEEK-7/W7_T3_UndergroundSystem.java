import java.util.*;

public class W7_T3_UndergroundSystem {

    static class UndergroundSystem {

        HashMap<Integer, String> checkInStation;
        HashMap<Integer, Integer> checkInTime;

        HashMap<String, Integer> totalTime;
        HashMap<String, Integer> totalTrips;

        public UndergroundSystem() {
            checkInStation = new HashMap<>();
            checkInTime = new HashMap<>();

            totalTime = new HashMap<>();
            totalTrips = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            checkInStation.put(id, stationName);
            checkInTime.put(id, t);
        }

        public void checkOut(int id, String stationName, int t) {

            String startStation = checkInStation.get(id);
            int startTime = checkInTime.get(id);

            String route = startStation + "->" + stationName;

            int time = t - startTime;

            totalTime.put(route, totalTime.getOrDefault(route, 0) + time);
            totalTrips.put(route, totalTrips.getOrDefault(route, 0) + 1);

            checkInStation.remove(id);
            checkInTime.remove(id);
        }

        public double getAverageTime(String startStation, String endStation) {

            String route = startStation + "->" + endStation;

            return (double) totalTime.get(route) / totalTrips.get(route);
        }
    }

    public static void main(String[] args) {

        UndergroundSystem system = new UndergroundSystem();

        system.checkIn(45, "Leyton", 3);
        system.checkIn(32, "Paradise", 8);
        system.checkIn(27, "Leyton", 10);

        system.checkOut(45, "Waterloo", 15);
        system.checkOut(27, "Waterloo", 20);
        system.checkOut(32, "Cambridge", 22);

        System.out.println(
            system.getAverageTime("Paradise", "Cambridge")
        );

        System.out.println(
            system.getAverageTime("Leyton", "Waterloo")
        );

        system.checkIn(10, "Leyton", 24);
        system.checkOut(10, "Waterloo", 38);

        System.out.println(
            system.getAverageTime("Leyton", "Waterloo")
        );
    }
}
