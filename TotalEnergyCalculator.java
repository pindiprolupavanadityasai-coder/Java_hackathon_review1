import java.util.Scanner;

public class TotalEnergyCalculator {

    // Method to calculate total energy
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read morning energy
        System.out.print("Enter morning energy generated (kWh): ");
        double morningEnergy = sc.nextDouble();

        // Read evening energy
        System.out.print("Enter evening energy generated (kWh): ");
        double eveningEnergy = sc.nextDouble();

        // Call method and display result
        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);
        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        sc.close();
    }
}
