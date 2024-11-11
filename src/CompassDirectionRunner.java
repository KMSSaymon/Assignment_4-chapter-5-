import java.util.*;
public class CompassDirectionRunner {
    public static void main(String[] args) {

        CompassDirection compassDirection = new CompassDirection();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle (in degree) : ");

        int angle = scanner.nextInt();

        angle = compassDirection.normalizeAngle(angle);

        String direction = compassDirection.calculateDirection(angle);

        System.out.println("Nearest compass direction : " + direction);
        scanner.close();
    }
}
