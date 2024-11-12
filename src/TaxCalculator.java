

public class TaxCalculator {

    public static double calculateTax(double income, String gender, int age)
    {
        double tax = 0;

        // Tax-free income threshold based on gender and age
        double taxFreeThreshold = 350000;  // Default for males
        if (gender.equalsIgnoreCase("female") || age > 65)
        {
            taxFreeThreshold = 400000;  // Female and seniors (above 65)
        }

        // Apply tax brackets based on the income ranges
        if (income <= taxFreeThreshold)
        {
            tax = 0;
        }
        else if (income <= 450000)
        {
            tax = (income - taxFreeThreshold) * 0.05;
        }
        else if (income <= 750000)
        {
            tax = (450000 - taxFreeThreshold) * 0.05 + (income - 450000) * 0.10;
        }
        else if (income <= 1150000)
        {
            tax = (450000 - taxFreeThreshold) * 0.05 + (750000 - 450000) * 0.10 + (income - 750000) * 0.15;
        }
        else if (income <= 1650000)
        {
            tax = (450000 - taxFreeThreshold) * 0.05 + (750000 - 450000) * 0.10 + (1150000 - 750000) * 0.15 + (income - 1150000) * 0.20;
        }
        else
        {
            tax = (450000 - taxFreeThreshold) * 0.05 + (750000 - 450000) * 0.10 + (1150000 - 750000) * 0.15 + (1650000 - 1150000) * 0.20 + (income - 1650000) * 0.25;
        }

        return tax;
    }


}
