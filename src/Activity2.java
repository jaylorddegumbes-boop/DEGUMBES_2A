import java.util.Scanner;

public class Activity2 {

    public void cinemaTicket(Scanner sc) {

        System.out.println();
        System.out.println("=== CINEMA TICKET SYSTEM ===");

        System.out.print("Select Format (1: REGULAR, 2: 3D, 3: IMAX): ");
        int format = sc.nextInt();

        System.out.print("Enter Screening Hour (24-Hour Format, e.g., 18): ");
        int hour = sc.nextInt();

        String screeningFormat;
        double basePrice;

        // Determine ticket format and price
        if (format == 1) {
            screeningFormat = "REGULAR";
            basePrice = 350.00;
        } else if (format == 2) {
            screeningFormat = "3D";
            basePrice = 400.00;
        } else if (format == 3) {
            screeningFormat = "IMAX";
            basePrice = 450.00;
        } else {
            System.out.println("Invalid format selected.");
            return;
        }

        // Determine peak-hour fee
        double peakHourFee = 0.00;

        if (hour >= 17 && hour <= 20) {
            peakHourFee = 50.00;
        }

        double totalCost = basePrice + peakHourFee;

        System.out.println();
        System.out.println("--- TICKET BREAKDOWN ---");
        System.out.println("Screening Format: " + screeningFormat);
        System.out.printf("Base Ticket Price: PHP %.2f%n", basePrice);
        System.out.printf("Peak Hour Fee:     PHP %.2f%n", peakHourFee);
        System.out.println("-----------------------------------");
        System.out.printf("TOTAL TICKET COST: PHP %.2f%n", totalCost);
        System.out.println("STATUS:             SEAT RESERVED");
    }
}