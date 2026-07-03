
package vu.question4;

import java.util.Random;
public class NaroSensorSystem {
    
    public static void main(String[] args) {
        // Initialize constants and utilities
        int totalDays = 30;
        double[] rainfallReadings = new double[totalDays];
        Random random = new Random();

        // Variables for calculations
        double totalRainfall = 0.0;
        int wetDaysCount = 0;

        System.out.println("=== Namulonge Maize Farm Daily Sensor Readings ===");

        // (i) Generate 30 random daily rainfall readings between 0 and 60 mm
        for (int i = 0; i < totalDays; i++) {
            // nextDouble() returns 0.0 to 1.0, multiplied by 60 gives 0.0 to 60.0
            rainfallReadings[i] = random.nextDouble() * 60.0;
            
            // Format output to 2 decimal places for visual presentation
            System.out.printf("Day %2d: %5.2f mm\n", (i + 1), rainfallReadings[i]);

            // (ii) Accumulate the total monthly rainfall
            totalRainfall += rainfallReadings[i];

            // (iii) Count the number of "wet days" (rainfall greater than 30 mm)
            if (rainfallReadings[i] > 30.0) {
                wetDaysCount++;
            }
        }

        // (ii) Compute average monthly rainfall
        double averageRainfall = totalRainfall / totalDays;

        // Display Calculated metrics
        System.out.println("\n=== Seasonal Summary Metrics ===");
        System.out.printf("Total Monthly Rainfall   : %.2f mm\n", totalRainfall);
        System.out.printf("Average Daily Rainfall   : %.2f mm\n", averageRainfall);
        System.out.println("Number of Wet Days (>30mm): " + wetDaysCount);

        // (iv) Use if-else-if structure to classify the month
        System.out.print("Agronomist Classification : ");
        if (totalRainfall <= 300.0) {
            System.out.println("Dry (Warning: Monitor dry spells for crop stress)");
        } else if (totalRainfall < 600.0) {
            System.out.println("Normal (Ideal conditions for maize development)");
        } else {
            System.out.println("Flood-risk (Warning: High risk of soil waterlogging)");
        }
    }
}

    

