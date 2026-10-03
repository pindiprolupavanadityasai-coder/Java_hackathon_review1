import java.util.Scanner;

public class SolarEnergyMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read energy generated from user
        System.out.print("Enter energy generated (kWh): ");
        double energyGenerated = sc.nextDouble();

        // If-Else condition to check energy level
        if (energyGenerated >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        sc.close();
    }
}
