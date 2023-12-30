
// * Import
import global.*;

// Code
public class Run {
    private static final double G = 9.80665;

    // private static final int NUMBER_OF_STEPS = 10;
    // private static final double VELOCITY = 0.;
    // private static final double ANGLE = 45.;

    private static double velocity;
    private static double angle;
    private static int steps;

    public static void main(String args[]) {
        velocityAngleAndTimeTable();
    }

    private static void velocityAngleAndTimeTable() {
        intro();

        Row.skip(3);

        tableDisplayer();
    }

    private static void intro() {
        Row.skip(3);
        Display.itn("Ticks table of kicks:");
        Row.skip(1);

        Display.itn("Enter velocity`s value, please: ");
        velocity = Variable.scan.nextDouble();
        Display.itn("Enter angle in degrees, please: ");
        angle = angleToRadians(Variable.scan.nextDouble());
        Display.itn("Enter number of steps, please: ");
        steps = Variable.scan.nextInt();
    }

    private static void tableDisplayer() {
        title();
        space();
        content(steps);
    }

    private static void title() {
        Display.itn("    Step    |    x    |    y    |    Time    ");
    }

    private static void space() {
        for (int i = 0; i < 45; i++) {
            Display.it("*");
        }
        Row.skip(1);
    }

    private static void content(int numberOfSteps) {
        double traceX = velocity * Math.cos(angle);
        double traceY = velocity * Math.sin(angle);
        double fullTime = 2 * traceY / G;
        double stepTime = fullTime / numberOfSteps;

        double stepX = traceX * stepTime;

        double currentX = 0, currentY = 0, currentTime = 0;

        System.out.println("step\tx\ty\ttime");
        System.out.println("0\t0.0\t0.0\t0.0");
        for (int i = 1; i <= steps; i++) {
            currentX += stepX;
            currentY = traceY * currentTime + ((1 / 2) * G * currentTime * currentTime);
            currentTime += stepTime;

            Display.itn("     " + i + "      |    " + round(currentX, 2) + "    |    "
                    + round(currentY, 3) + "    |    " + round(i * stepTime, 2));
        }
    }

    private static double angleToRadians(double angleInDegrees) {
        double angleInRadians = angleInDegrees * Math.PI / 180;

        return angleInRadians;
    }

    private static double round(double number, int coef) {
        double result = Math.round(number * Math.pow(10, coef)) / Math.pow(10, coef);
        return result;
    }
}