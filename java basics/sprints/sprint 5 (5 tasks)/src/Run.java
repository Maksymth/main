
// * Import
import global.*;
import tasks.FirstTask;
import tasks.SecoundTask;
import tasks.ThirdTask;
import tasks.FourthTask;
import tasks.Fifth;

// Code
public class Run {
    public static void main(String[] args) {
        FirstTask.dayOfWeekShower(23, 12, 2023, 4, 1);
        Display.itn("\n\n--------------------------------------------------------- End of task.\n\n");
        SecoundTask.twoRollsDisplayer(25);
        Display.itn("\n\n--------------------------------------------------------- End of task.\n\n");
        ThirdTask.offcutLengthDisplayer(2, 0, 4, 0); // x1 & y1 is coordinates of first punctum, x2 & y2 - of secound.
        Display.itn("\n\n--------------------------------------------------------- End of task.\n\n");
        FourthTask.satelliteEscapeVelocityDisplayer(612 * Math.pow(10, 3)); // in kilometers
        Row.skip(1);
        FourthTask.satelliteEscapeVelocityDisplayer(312 * Math.pow(10, 3)); // in kilometers
        Display.itn("\n\n--------------------------------------------------------- End of task.\n\n");
        Fifth.rabbitsPopulationCalculation("*", "|");
        Display.itn("\n\n--------------------------------------------------------- End of task.\n\n");
    }
}
