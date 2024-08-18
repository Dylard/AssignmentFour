import java.util.Scanner;

public class WeeklyTemps {
    public static void main(String[] args) {
        // Create two arrays
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double[] temperatures = new double[7];

        // Ask user for temps
        Scanner scanner = new Scanner(System.in);

        // Loop to get temperatures for each day
        for (int i = 0; i < days.length; i++) {
            System.out.println("Enter the average temperature for " + days[i] + ":");
            temperatures[i] = scanner.nextDouble();
        }

        // Display each day and its temperature
        System.out.println("\nDaily Temperatures:");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + ": " + temperatures[i] + "°C");
        }

        // Calculate and display the weekly average temperature
        double totalTemperature = 0;
        for (int i = 0; i < temperatures.length; i++) {
            totalTemperature += temperatures[i];
        }

        double weeklyAverage = totalTemperature / temperatures.length;
        System.out.println("Weekly Average Temperature: " + weeklyAverage + "°C");
    }
}