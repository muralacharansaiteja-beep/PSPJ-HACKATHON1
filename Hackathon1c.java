import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read water consumption from the user
        System.out.print("Enter water consumption in litres: ");
        double consumption = scanner.nextDouble();

        double bill;

        // Calculate bill using if-else statement
        if (consumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        // Display the results
        System.out.println("Water Consumption : " + consumption + " litres");
        System.out.println("Water Bill        : Rs. " + bill);

        scanner.close();
    }
}
