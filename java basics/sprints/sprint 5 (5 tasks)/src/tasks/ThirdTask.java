package tasks;

// Import
import global.*;

// Code
public class ThirdTask {
    public static void offcutLengthDisplayer(double x1, double y1, double x2, double y2) {
        double expression, result;

        expression = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        result = Math.sqrt(expression);

        Row.skip(3);
        Display.itn("Offcut length is - " + result);
        Row.skip(1);
    }
}
