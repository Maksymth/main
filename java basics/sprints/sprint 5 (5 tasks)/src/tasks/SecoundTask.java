package tasks;

// Import
import global.*;

// Code
public class SecoundTask {
    public static void twoRollsDisplayer(int times) {
        for (int i = 0; i < times; i++) {
            int currentTime = i + 1;
            if (i == 0) {
                Row.skip(3);
            } else {
                Row.skip(1);
            }
            Display.itn("Time: " + currentTime);
            Display.itn("First roll result: " + rollResult());
            Display.itn("Secound roll result: " + rollResult());
            Row.skip(1);
        }
    }

    private static int rollResult() {
        double rollResult = Math.random() * 6 + 1;

        return (int) rollResult;
    }
}