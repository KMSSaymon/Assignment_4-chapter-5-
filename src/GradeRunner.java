import java .util.*;
public class GradeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade grade = new Grade();

        System.out.print("Enter the letter grade : ");
        String letterGrade = scanner.nextLine().trim().toUpperCase();

        double numericValue = grade.getNumaricGrade(letterGrade);
        System.out.println("The numeric value is : " + numericValue);
    }
}
