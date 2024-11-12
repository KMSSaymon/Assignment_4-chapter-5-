import java.util.*;
public class TaxCalculatorRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxCalculator taxCalculator = new TaxCalculator();

        // Input the taxpayer details
        System.out.print("Enter your gender (male/female): ");
        String gender = scanner.nextLine().trim();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        // Calculate the tax based on the input
        double tax = taxCalculator.calculateTax(income, gender, age);

        // Output the tax to be paid
        System.out.println("The tax payable is: BDT " + tax);
    }
}
