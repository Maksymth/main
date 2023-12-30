package tasks;

// Import
import global.*;

// Code
public class FirstTask {
    private static String dayOfWeekStrings[] = { "Monday", "Tuesday", "Wensday", "Thursday",
            "Friday", "Saturday", "Sunday" };

    public static void dayOfWeekShower(int day, int month, int year, int upperSpace, int bottomSpace) {
        Row.skip(upperSpace);

        int nYear = year - (14 - month) / 12;
        int x = nYear + nYear / 4 - nYear / 100 + nYear / 400;
        int nMonth = month + 12 * ((14 - month) / 12) - 2;

        int intResult = (day + x + 31 * nMonth / 12 - 1) % 7;

        Display.itn(dayOfWeekStrings[intResult]);

        Row.skip(bottomSpace);
    }
}
