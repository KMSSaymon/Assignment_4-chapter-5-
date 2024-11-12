
public class Grade {

    public double getNumaricGrade(String letterGrade)
    {
        double baseGrade = 0.0;

        if(letterGrade.charAt(0) == 'A') baseGrade = 4.0;
        else if(letterGrade.charAt(0) == 'B') baseGrade = 3.0;
        else if(letterGrade.charAt(0) == 'C') baseGrade = 2.0;
        else if(letterGrade.charAt(0) == 'D') baseGrade = 1.0;
        else if(letterGrade.charAt(0) == 'F') baseGrade = 0.0;

        if(letterGrade.length() > 1)
        {
            if(letterGrade.charAt(1) == '+' && baseGrade < 4.0 ) baseGrade = baseGrade + 0.3;
            else if(letterGrade.charAt(1) == '-') baseGrade = baseGrade - 0.3;
        }

        return baseGrade;
    }


}
