
public class CompassDirection {

    public static int normalizeAngle(int angle) {
        angle = angle % 360;
        if(angle <0){
            angle = angle + 360;
        }
        return angle;
    }

    public  String calculateDirection(int angle)
    {
        String [] directions = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};


        int index =(int)Math.round(angle/45.0)%8;

        return directions[index];
    }

}
