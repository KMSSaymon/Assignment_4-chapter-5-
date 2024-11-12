import java.util.*;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.printf("Please enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double largest;

        // Determine the largest number
        if(num1 > num2 && num1 > num3)  largest = num1;
        else if (num2 > num1 && num2 > num3) {
            largest = num2;
        }
        else largest = num3;

        // Print the largest number
        System.out.println("The largest number is " + largest);
    }
}
