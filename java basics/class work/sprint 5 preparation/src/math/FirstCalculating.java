package math;

import java.lang.Math;

public class FirstCalculating {
    final static double x = 31.45;
    final static double y = 49;

    final static double coefficient = (double) (1 / 2);
    final static double subtrahend = (double) (Math.PI / Math.sqrt(y));

    public static void main(String[] args) {
        System.out.print("\nFormula: c1 ? {?}(x ? {?})\n\n");
        System.out.print("1/2 + sin(x + PI/(y*y))\n\n");

        FirstCalculating.formula("-", "cosinu", "+",
                coefficient, subtrahend);
    }

    public static void formula(String operatorOne, String trigonometricValue,
            String operatorTwo, double coefficient, double subtrahend) throws ArithmeticException {
        double formulaResult;

        if (operatorOne == "+" && operatorTwo == "+" && trigonometricValue == "sinus"
                || operatorOne == "+" && operatorTwo == "+" && trigonometricValue == "sin") {
            formulaResult = coefficient + Math.sin(x + subtrahend);
        } else if (operatorOne == "-" && operatorTwo == "+" && trigonometricValue == "sinus"
                || operatorOne == "-" && operatorTwo == "+" && trigonometricValue == "sin") {
            formulaResult = coefficient - Math.sin(x + subtrahend);
        } else if (operatorOne == "*" && operatorTwo == "+" && trigonometricValue == "sinus"
                || operatorOne == "*" && operatorTwo == "+" && trigonometricValue == "sin") {
            formulaResult = coefficient * Math.sin(x + subtrahend);
        } else if (operatorOne == "/" && operatorTwo == "+" && trigonometricValue == "sinus"
                || operatorOne == "/" && operatorTwo == "+" && trigonometricValue == "sin") {
            formulaResult = coefficient / Math.sin(x + subtrahend);
        } else if (operatorOne == "+" && operatorTwo == "-" && trigonometricValue == "sinus"
                || operatorOne == "+" && operatorTwo == "-" && trigonometricValue == "sin") {
            formulaResult = coefficient + Math.sin(x - subtrahend);
        } else if (operatorOne == "-" && operatorTwo == "-" && trigonometricValue == "sinus"
                || operatorOne == "-" && operatorTwo == "-" && trigonometricValue == "sin") {
            formulaResult = coefficient - Math.sin(x - subtrahend);
        } else if (operatorOne == "*" && operatorTwo == "-" && trigonometricValue == "sinus"
                || operatorOne == "*" && operatorTwo == "-" && trigonometricValue == "sin") {
            formulaResult = coefficient * Math.sin(x - subtrahend);
        } else if (operatorOne == "/" && operatorTwo == "-" && trigonometricValue == "sinus"
                || operatorOne == "/" && operatorTwo == "-" && trigonometricValue == "sin") {
            formulaResult = coefficient / Math.sin(x - subtrahend);
        } else if (operatorOne == "+" && operatorTwo == "*" && trigonometricValue == "sinus"
                || operatorOne == "+" && operatorTwo == "*" && trigonometricValue == "sin") {
            formulaResult = coefficient + Math.sin(x * subtrahend);
        } else if (operatorOne == "-" && operatorTwo == "*" && trigonometricValue == "sinus"
                || operatorOne == "-" && operatorTwo == "*" && trigonometricValue == "sin") {
            formulaResult = coefficient - Math.sin(x * subtrahend);
        } else if (operatorOne == "*" && operatorTwo == "*" && trigonometricValue == "sinus"
                || operatorOne == "*" && operatorTwo == "*" && trigonometricValue == "sin") {
            formulaResult = coefficient * Math.sin(x * subtrahend);
        } else if (operatorOne == "/" && operatorTwo == "*" && trigonometricValue == "sinus"
                || operatorOne == "/" && operatorTwo == "*" && trigonometricValue == "sin") {
            formulaResult = coefficient / Math.sin(x * subtrahend);
        } else if (operatorOne == "+" && operatorTwo == "/" && trigonometricValue == "sinus"
                || operatorOne == "+" && operatorTwo == "/" && trigonometricValue == "sin") {
            formulaResult = coefficient + Math.sin(x / subtrahend);
        } else if (operatorOne == "-" && operatorTwo == "/" && trigonometricValue == "sinus"
                || operatorOne == "-" && operatorTwo == "/" && trigonometricValue == "sin") {
            formulaResult = coefficient - Math.sin(x / subtrahend);
        } else if (operatorOne == "*" && operatorTwo == "/" && trigonometricValue == "sinus"
                || operatorOne == "*" && operatorTwo == "/" && trigonometricValue == "sin") {
            formulaResult = coefficient * Math.sin(x / subtrahend);
        } else if (operatorOne == "/" && operatorTwo == "/" && trigonometricValue == "sinus"
                || operatorOne == "/" && operatorTwo == "/" && trigonometricValue == "sin") {
            formulaResult = coefficient / Math.sin(x / subtrahend);
        } else if (operatorOne == "+" && operatorTwo == "+" && trigonometricValue == "cosinus"
                || operatorOne == "+" && operatorTwo == "+" && trigonometricValue == "cos") {
            formulaResult = coefficient + Math.cos(x + subtrahend);
        } else if (operatorOne == "-" && operatorTwo == "+" && trigonometricValue == "cosinus"
                || operatorOne == "-" && operatorTwo == "+" && trigonometricValue == "cos") {
            formulaResult = coefficient - Math.cos(x + subtrahend);
        } else if (operatorOne == "*" && operatorTwo == "+" && trigonometricValue == "cosinus"
                || operatorOne == "*" && operatorTwo == "+" && trigonometricValue == "cos") {
            formulaResult = coefficient * Math.cos(x + subtrahend);
        } else if (operatorOne == "/" && operatorTwo == "+" && trigonometricValue == "cosinus"
                || operatorOne == "/" && operatorTwo == "+" && trigonometricValue == "cos") {
            formulaResult = coefficient / Math.cos(x + subtrahend);
        } else if (operatorOne == "+" && operatorTwo == "-" && trigonometricValue == "cosinus"
                || operatorOne == "+" && operatorTwo == "-" && trigonometricValue == "cos") {
            formulaResult = coefficient + Math.cos(x - subtrahend);
        } else if (operatorOne == "-" && operatorTwo == "-" && trigonometricValue == "cosinus"
                || operatorOne == "-" && operatorTwo == "-" && trigonometricValue == "cos") {
            formulaResult = coefficient - Math.cos(x - subtrahend);
        } else if (operatorOne == "*" && operatorTwo == "-" && trigonometricValue == "cosinus"
                || operatorOne == "*" && operatorTwo == "-" && trigonometricValue == "cos") {
            formulaResult = coefficient * Math.cos(x - subtrahend);
        } else if (operatorOne == "/" && operatorTwo == "-" && trigonometricValue == "cosinus"
                || operatorOne == "/" && operatorTwo == "-" && trigonometricValue == "cos") {
            formulaResult = coefficient / Math.cos(x - subtrahend);
        } else if (operatorOne == "+" && operatorTwo == "*" && trigonometricValue == "cosinus"
                || operatorOne == "+" && operatorTwo == "*" && trigonometricValue == "cos") {
            formulaResult = coefficient + Math.cos(x * subtrahend);
        } else if (operatorOne == "-" && operatorTwo == "*" && trigonometricValue == "cosinus"
                || operatorOne == "-" && operatorTwo == "*" && trigonometricValue == "cos") {
            formulaResult = coefficient - Math.cos(x * subtrahend);
        } else if (operatorOne == "*" && operatorTwo == "*" && trigonometricValue == "cosinus"
                || operatorOne == "*" && operatorTwo == "*" && trigonometricValue == "cos") {
            formulaResult = coefficient * Math.cos(x * subtrahend);
        } else if (operatorOne == "/" && operatorTwo == "*" && trigonometricValue == "cosinus"
                || operatorOne == "/" && operatorTwo == "*" && trigonometricValue == "cos") {
            formulaResult = coefficient / Math.cos(x * subtrahend);
        } else if (operatorOne == "+" && operatorTwo == "/" && trigonometricValue == "cosinus"
                || operatorOne == "+" && operatorTwo == "/" && trigonometricValue == "cos") {
            formulaResult = coefficient + Math.cos(x / subtrahend);
        } else if (operatorOne == "-" && operatorTwo == "/" && trigonometricValue == "cosinus"
                || operatorOne == "-" && operatorTwo == "/" && trigonometricValue == "cos") {
            formulaResult = coefficient - Math.cos(x / subtrahend);
        } else if (operatorOne == "*" && operatorTwo == "/" && trigonometricValue == "cosinus"
                || operatorOne == "*" && operatorTwo == "/" && trigonometricValue == "cos") {
            formulaResult = coefficient * Math.cos(x / subtrahend);
        } else if (operatorOne == "/" && operatorTwo == "/" && trigonometricValue == "cosinus"
                || operatorOne == "/" && operatorTwo == "/" && trigonometricValue == "cos") {
            formulaResult = coefficient / Math.cos(x / subtrahend);
        } else {
            throw new ArithmeticException("\n\n\nSomething inputed wrong..\n\n");
        }

        System.out.print("Result is: " + formulaResult + ".\n\n");
    }
}
