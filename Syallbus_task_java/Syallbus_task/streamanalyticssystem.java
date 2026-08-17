import java.util.*;
import java.util.stream.Collectors;

class Reading {
    String sensorId;
    double temperature;

    Reading(String sensorId, double temperature) {
        this.sensorId = sensorId;
        this.temperature = temperature;
    }
}

public class streamanalyticssystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of readings
        int n = sc.nextInt();

        // Store all readings
        List<Reading> readings = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String sensorId = sc.next();
            double temperature = sc.nextDouble();

            readings.add(new Reading(sensorId, temperature));
        }

        // Stream processing
        Map<String, Double> result = readings.stream()

                // 1. Filter temperature > 50
                .filter(r -> r.temperature > 50)

                // 2. Group by sensor ID
                // 3. Calculate average temperature
                .collect(Collectors.groupingBy(
                        r -> r.sensorId,
                        Collectors.averagingDouble(r -> r.temperature)
                ));

        // 4. Sort by average temperature in descending order
        result.entrySet()
                .stream()
                .sorted(
                        Map.Entry.<String, Double>comparingByValue()
                                .reversed()
                )

                // 5. Display result
                .forEach(entry ->
                        System.out.println(
                                entry.getKey() + " " + entry.getValue()
                        )
                );

        sc.close();
    }
}