import java.util.*;
public class Grade2 {

    public String getLetterGrade(double numericGrade){
        if(numericGrade == 4.0) return "A+";
        else if(numericGrade >= 3.85) return "A";
        else if(numericGrade >= 3.5 ) return "A-";
        else if(numericGrade >= 2.85) return "B";
        else if(numericGrade >= 2.5) return "B-";
        else if(numericGrade >= 1.85) return "C";
        else if(numericGrade >= 1.5) return "C-";
        else if(numericGrade >= 0.85) return "D";
        else if(numericGrade >= 0.5) return "D-";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade2 grade = new Grade2();

        System.out.print("Enter the numeric grade (0 to 4) : ");
        double numericGrade = scanner.nextDouble();

        String letterGrade = grade.getLetterGrade(numericGrade);
        System.out.println("The letter grade for " + numericGrade + " is : " + letterGrade);
    }
}
