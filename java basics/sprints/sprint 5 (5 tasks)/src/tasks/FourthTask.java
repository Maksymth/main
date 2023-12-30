package tasks;

// Import
import global.*;

// Code
public class FourthTask {
    private static final double EARTH_MASS = 5.97 * Math.pow(10, 24);
    private static final double EARTH_RADIUS = 6371 * Math.pow(10, 3); // in kilometers
    private static final double GRAVITY_CONSTANT = 6.67 * Math.pow(10, -11);

    public static void satelliteEscapeVelocityDisplayer(double input) { // output in meters
        double sideExpression, distanceToEarth, result; // parameters

        distanceToEarth = input; // input setting

        sideExpression = (GRAVITY_CONSTANT * EARTH_MASS) / (EARTH_RADIUS + distanceToEarth); // expression
        result = Math.sqrt(sideExpression);

        Row.skip(3);
        Display.itn("Satellite speed is - " + Math.round(result) + " m/s.");
        Row.skip(1);
    }
}