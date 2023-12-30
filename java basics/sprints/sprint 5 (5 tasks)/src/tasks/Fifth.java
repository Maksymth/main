package tasks;

// * Import
import global.*;

// Code
public class Fifth {
    private static final int UP_TO = 12;

    public static void rabbitsPopulationCalculation(String titleSymbol, String divisionSymbol) {
        title();
        space(titleSymbol);
        content(divisionSymbol);
    }

    private static void title() {
        Display.itn("   Ordered number   |   Result   ");
    }

    private static void space(String titleSymbol) {
        for (int i = 0; i < 36; i++) {
            Display.it(titleSymbol);
        }
        Row.skip(1);
    }

    private static void content(String divisionSymbol) {
        for (int currentRowFromZero = 0; currentRowFromZero <= UP_TO; currentRowFromZero++) {
            if (currentRowFromZero > 9) {
                Display.itn("         " + currentRowFromZero + "         " + divisionSymbol + "     "
                        + calculationResult(currentRowFromZero) + "   ");
            } else {
                Display.itn("         " + currentRowFromZero + "          " + divisionSymbol + "     "
                        + calculationResult(currentRowFromZero) + "   ");
            }
        }
    }

    private static String calculationResult(int currentRow) {
        double expression;

        expression = (1 / Math.sqrt(5))
                * (Math.pow(((1 + Math.sqrt(5)) / 2), currentRow) - Math.pow(((1 - Math.sqrt(5)) / 2), currentRow));

        int sideResult = (int) expression;

        String result = Integer.toString(sideResult);

        return result;
    }
}