import java.util.Scanner;

public class WaterConsumptionCalculator {

    // Method to calculate total water consumption
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read morning and evening water usage from the user
        System.out.print("Enter morning water usage (in litres): ");
        int morningUsage = scanner.nextInt();

        System.out.print("Enter evening water usage (in litres): ");
        int eveningUsage = scanner.nextInt();

        // Call the method and store the result
        int totalConsumption = calculateTotal(morningUsage, eveningUsage);

        // Display the details
        System.out.println("\n--- Water Consumption Details ---");
        System.out.println("Morning Usage     : " + morningUsage + " litres");
        System.out.println("Evening Usage     : " + eveningUsage + " litres");
        System.out.println("Total Consumption : " + totalConsumption + " litres");

        scanner.close();
    }
}