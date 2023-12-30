package app.figure;

// * Input
import global.*;
import app.input.Input;

// Code
public class Figure {
    // Repair parameter-tool for amount of rows
    private static int rowAmountPrivate;

    // *
    // * Creator final collecting
    // *
    public static void creator() {
        // Row amount repairing
        repair(Input.rowAmount, Input.symbolSpaceAmount, Input.symbolSpaceAmount, Input.endSymbolFigureAmount);

        // Extra up space
        extraVerticalCreator(Input.spaceUp, rowAmountPrivate, Input.symbolSpaceAmount, Input.endSymbolFigureAmount,
                Input.spaceLeft, Input.spaceRight, Input.spaceSymbol);

        // Figure creating
        builder(Figure.rowAmountPrivate, Input.symbolSpaceAmount, Input.endSymbolFigureAmount,
                Input.spaceLeft, Input.spaceRight,
                Input.figureSymbol, Input.spaceSymbol);

        // Extra bottom space
        extraVerticalCreator(Input.spaceBottom, rowAmountPrivate, Input.symbolSpaceAmount, Input.endSymbolFigureAmount,
                Input.spaceLeft, Input.spaceRight, Input.spaceSymbol);
        // Ending
        Row.skip(1); // new line
    }

    // Repair for amount of rows, in different conditions
    private static void repair(int rowAmount, int spaceAmount, int symbolSpaceAmount, int endSymbolFigureAmount) {
        if (spaceAmount % 2 == 1 && endSymbolFigureAmount == 1) { // symbol space amount is odd, and ending figure
                                                                  // symbol amount is 1.
            rowAmountPrivate = rowAmount - 1;
        } else { // or
            rowAmountPrivate = rowAmount;
        } // ending.
    }

    //
    // * Figure final collecting
    //
    private static void builder(int rowAmount, int spaceAmount, int endSymbolFigureAmount,
            int spaceLeft, int spaceRight, String figureSymbol, String spaceSymbol) {
        for (int i = 0; i < rowAmount; i++) {
            int rowCurrentNumber = i;

            // * Extra left space
            extraHorizontalCreator(spaceLeft, spaceSymbol);

            // * Figure
            if (spaceAmount % 2 == 1 && endSymbolFigureAmount == 1) { // rowAmountPrivate = rowAmount - 1.
                // Left space part
                sideSpaceCreator(spaceAmount, rowCurrentNumber, spaceSymbol);
                // Left figure part
                figurePartCreator(rowAmount, rowCurrentNumber, figureSymbol);
                // Left space center part
                centerSpaceCreator(rowAmount, spaceAmount, rowCurrentNumber, spaceSymbol);
                // Figure middle
                for (int a = 0; a < spaceAmount; a++) {
                    Display.it(spaceSymbol);
                }
                // Right space center part
                centerSpaceCreator(rowAmount, spaceAmount, rowCurrentNumber, spaceSymbol);
                // Right figure part
                figurePartCreator(rowAmount, rowCurrentNumber, figureSymbol);
                // Right space part
                sideSpaceCreator(spaceAmount, rowCurrentNumber, spaceSymbol);
                // Ending line, added, because row amount is less by one, compared with
                // user setted value.
                if (rowCurrentNumber == rowAmount - 1) {
                    // Extra right space creating and row skip, as finalization of figure main part
                    extraHorizontalCreator(spaceRight, spaceSymbol);
                    Row.skip(1);

                    // * Extra left space
                    extraHorizontalCreator(spaceLeft, spaceSymbol);
                    // End row creating
                    endRowCreator(rowAmount, spaceAmount, rowCurrentNumber, figureSymbol,
                            spaceSymbol);
                    // ..
                }
            } else { // rowAmountPrivate = rowAmount.
                // Left space part
                sideSpaceCreator(spaceAmount, rowCurrentNumber, spaceSymbol);
                // Left figure part
                figurePartCreator(rowAmount, rowCurrentNumber, figureSymbol);
                // Center space, full
                centerSpaceCreator(rowAmount, spaceAmount, rowCurrentNumber, spaceSymbol);
                centerSpaceCreator(rowAmount, spaceAmount, rowCurrentNumber, spaceSymbol);
                // Right figure part
                figurePartCreator(rowAmount, rowCurrentNumber, figureSymbol);
                // Right space part
                sideSpaceCreator(spaceAmount, rowCurrentNumber, spaceSymbol);
                // ..
            }

            // * Extra right space
            extraHorizontalCreator(spaceRight, spaceSymbol);

            // * Ending
            Row.skip(1); // new line
        }
    }

    // * Figure basic creators
    private static void sideSpaceCreator(int symbolSpaceAmount, int rowCurrentNumber, String symbol) {
        for (int i = 0; i < rowCurrentNumber * symbolSpaceAmount; i++) {
            Display.it(symbol);
        }
    }

    private static void figurePartCreator(int rowTotalAmount, int rowCurrentNumber, String symbol) {
        for (int i = 0; i < rowTotalAmount - rowCurrentNumber; i++) {
            Display.it(symbol);
        }
    }

    private static void centerSpaceCreator(int rowAmount, int symbolSpaceAmount, int rowCurrentNumber,
            String symbol) {
        for (int i = 0; i < ((symbolSpaceAmount - 1) * (rowAmount - rowCurrentNumber))
                - (symbolSpaceAmount - 1); i++) {
            Display.it(symbol);
        }
    }

    // * End row creator, only for one available condition
    private static void endRowCreator(int rowAmount, int symbolSpaceAmount, int rowCurrentNumber, String figureSymbol,
            String spaceSymbol) {
        partOfEndRow(rowAmount, symbolSpaceAmount, rowCurrentNumber, spaceSymbol);

        Display.it(figureSymbol);

        partOfEndRow(rowAmount, symbolSpaceAmount, rowCurrentNumber, spaceSymbol);
    }

    // * Extra vertical and horizontal space creators
    // Vertical
    private static void extraVerticalCreator(int count, int rowAmount, int symbolSpaceAmount, int endSymbolFigureAmount,
            int left, int right,
            String symbol) {
        for (int i = 0; i < count; i++) {
            // Extra left space
            extraHorizontalCreator(left, symbol);
            // Ending row creating
            if (symbolSpaceAmount % 2 == 1 && endSymbolFigureAmount == 1) { // symbol space amount is odd, and ending
                                                                            // figure symbol amount is 1.
                for (int o = 0; o < 2 * (rowAmount + rowAmount * (symbolSpaceAmount - 1))
                        - (symbolSpaceAmount - 1) + 1; o++) {
                    Display.it(symbol);
                }
                // ..
            } else { // or
                if (symbolSpaceAmount % 2 == 1) { // symbol space amount only is odd.
                    partOfOddVerticalRow(rowAmount, symbolSpaceAmount, symbol);
                    partOfOddVerticalRow(rowAmount, symbolSpaceAmount, symbol);
                } else { // symbol space amount only is even.
                    partOfEvenVerticalRow(rowAmount, symbolSpaceAmount, symbol);
                    partOfEvenVerticalRow(rowAmount, symbolSpaceAmount, symbol);
                }
                // ..
            }
            // Extra right space
            extraHorizontalCreator(right, symbol);
            // Ending
            Row.skip(1); // new line
        }
    }

    // Horizontal
    private static void extraHorizontalCreator(int count, String symbol) {
        for (int i = 0; i < count; i++) {
            Display.it(symbol);
        }
    }

    // * Row`s parts
    // Used if: symbol space amount is odd, and ending symbol amount is 1
    private static void partOfEndRow(int rowAmount, int symbolSpaceAmount, int rowCurrentNumber, String spaceSymbol) {
        for (int i = 0; i < rowAmount + rowAmount * (symbolSpaceAmount - 1)
                - (symbolSpaceAmount - (symbolSpaceAmount - (symbolSpaceAmount - 1) / 2)); i++) {
            Display.it(spaceSymbol);
        }
    }

    // Used if: symbol space amount only is odd
    private static void partOfOddVerticalRow(int rowAmount, int symbolSpaceAmount, String spaceSymbol) {
        for (int o = 0; o < rowAmount + (rowAmount * (symbolSpaceAmount - 1))
                - (symbolSpaceAmount - (symbolSpaceAmount - (symbolSpaceAmount - 3)) / 2); o++) {
            Display.it(spaceSymbol);
        }
    }

    // Used if: symbol space amount only is even
    private static void partOfEvenVerticalRow(int rowAmount, int symbolSpaceAmount, String spaceSymbol) {
        for (int o = 0; o < rowAmount + (rowAmount * (symbolSpaceAmount - 1))
                - (symbolSpaceAmount - (symbolSpaceAmount - (symbolSpaceAmount - 3 + 1)) / 2); o++) {
            Display.it(spaceSymbol);
        }
    }
}