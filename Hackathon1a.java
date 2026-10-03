public class HouseholdDetails {
    public static void main(String[] args) {
        // Storing details using appropriate data types
        int houseNumber = 102;
        int numberOfFamilyMembers = 4;
        double waterConsumed = 450.50; // in litres
        char waterUsageStatus = 'N';    // 'N' for Normal, 'H' for High, etc.

        // Displaying the details
        System.out.println("--- Household Details ---");
        System.out.println("House Number : " + houseNumber);
        System.out.println("Number of Family Members: " + numberOfFamilyMembers);
        System.out.println("Water Consumed: " + waterConsumed + " litres");
        System.out.println("Water Usage Status: " + waterUsageStatus);
    }
}