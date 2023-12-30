package app.input;

// * Import
import java.util.Scanner;
import global.*;
import app.var.Parameter;

// Code
public class Input {
	// * Basic parameters
	// Extra parameters
	public static int spaceUp = Parameter.basic.extra.SPACE_UP,
			spaceBottom = Parameter.basic.extra.SPACE_BOTTOM,
			spaceLeft = Parameter.basic.extra.SPACE_LEFT,
			spaceRight = Parameter.basic.extra.SPACE_RIGHT;
	// Figure parameters
	public static int rowAmount = Parameter.basic.figure.ROW_AMOUNT,
			symbolSpaceAmount = Parameter.basic.figure.SYMBOL_SPACE_AMOUNT,
			endSymbolFigureAmount = Parameter.basic.figure.END_SYMBOL_FIGURE_AMOUNT;
	// Symbol parameters
	public static String figureSymbol = Parameter.basic.symbol.FIGURE_SYMBOL,
			spaceSymbol = Parameter.basic.symbol.SPACE_SYMBOL;
	// * Reader parameters
	// «Is equal?» parameters
	public static String[] isEqual = { Parameter.basic.check.isEqual.SPACE_VERTICAL_AND_HORIZONTAL,
			Parameter.basic.check.isEqual.SPACE_VERTICAL,
			Parameter.basic.check.isEqual.SPACE_HORIZONTAL };
	// Equal number parameters
	public static int[] equalNumber = { Parameter.basic.check.equalNumber.SPACE_VERTICAL_AND_HORIZONTAL,
			Parameter.basic.check.equalNumber.SPACE_VERTICAL,
			Parameter.basic.check.equalNumber.SPACE_HORIZONTAL };

	// * Description parameters
	// Extra`s descriptions
	public static String[] descriptionExtra = { Parameter.descripction.extra.SPACE_UP,
			Parameter.descripction.extra.SPACE_BOTTOM,
			Parameter.descripction.extra.SPACE_LEFT,
			Parameter.descripction.extra.SPACE_RIGHT };
	// Figure`s descriptions
	public static String[] descriprionFigure = { Parameter.descripction.figure.ROW_AMOUNT,
			Parameter.descripction.figure.SYMBOL_SPACE_AMOUNT,
			Parameter.descripction.figure.END_SYMBOL_FIGURE_AMOUNT };
	// Symbol`s descriptions
	public static String[] descriptionSymbol = { Parameter.descripction.symbol.FIGURE_SYMBOL,
			Parameter.descripction.symbol.SPACE_SYMBOL };

	// * Reader`s descriptions
	// «Is equal?» description parameters
	public static String[] descriptionCheckIs = { Parameter.descripction.check.isEqual.SPACE_VERTICAL_AND_HORIZONTAL,
			Parameter.descripction.check.isEqual.SPACE_VERTICAL,
			Parameter.descripction.check.isEqual.SPACE_HORIZONTAL };

	// Equal number`s description parameters
	public static String[] descriptionEqualNumber = {
			Parameter.descripction.check.equalNumber.SPACE_VERTICAL_AND_HORIZONTAL,
			Parameter.descripction.check.equalNumber.SPACE_VERTICAL,
			Parameter.descripction.check.equalNumber.SPACE_HORIZONTAL };

	// * Readers
	// Extra readers
	public static Scanner[] readExtra = { Read.extra.spaceUp,
			Read.extra.spaceBottom,
			Read.extra.spaceLeft,
			Read.extra.spaceRight };

	// Figure readers
	public static Scanner[] readFigure = { Read.figure.rowAmout,
			Read.figure.symbolSpaceAmount,
			Read.figure.endSymbolFigureAmount };

	// «Is equal?» readers
	public static Scanner[] readIsEqual = { Read.check.isEqual.spaceVerticalAndHorizontal,
			Read.check.isEqual.spaceVertical,
			Read.check.isEqual.spaceHorizontal };

	// Equal number readers
	public static Scanner[] readEqualNumber = { Read.check.equalNumber.spaceVerticalAndHorizontal,
			Read.check.equalNumber.spaceVertical,
			Read.check.equalNumber.spaceHorizontal };

	// *
	// * Collecting
	// *
	public static void user() {
		Row.skip(90);

		builder();
	}

	//
	// * Reader`s builder
	//
	public static void builder() throws Error {
		verticalAndHorizontalChecker();

		figureParameters();

		symbolParameters();
	}

	// Other
	public static void verticalAndHorizontalChecker() {
		// Read for «yes» or «no», and replace the value to «inputCheck..»
		isEqual[0] = (String) Get.s(readIsEqual[0], isEqual[0], descriptionCheckIs[0]);
		String inputCheckVerticalAndHorizontal = isEqual[0];
		// Validating
		throwError(inputCheckVerticalAndHorizontal, 1, 3);
		// Inputed value checking
		if (inputCheckVerticalAndHorizontal.equals("y") || inputCheckVerticalAndHorizontal.equals("Y")
				|| inputCheckVerticalAndHorizontal.equals("yes")
				|| inputCheckVerticalAndHorizontal.equals("YES")
				|| inputCheckVerticalAndHorizontal.equals("Yes")
				|| inputCheckVerticalAndHorizontal.equals("yEs")
				|| inputCheckVerticalAndHorizontal.equals("yeS")) {
			// Value reading
			int resultEqualNumber = (int) Get.i(readEqualNumber[0], equalNumber[0],
					descriptionEqualNumber[0]);
			// Validating
			throwError(resultEqualNumber, 0);
			// Extra space up/bottom and left/right parameters setting
			spaceUp = resultEqualNumber;
			spaceBottom = resultEqualNumber;
			spaceLeft = resultEqualNumber;
			spaceRight = resultEqualNumber;
		} else if (inputCheckVerticalAndHorizontal.equals("n")
				|| inputCheckVerticalAndHorizontal.equals("N")
				|| inputCheckVerticalAndHorizontal.equals("no")
				|| inputCheckVerticalAndHorizontal.equals("NO")
				|| inputCheckVerticalAndHorizontal.equals("No")
				|| inputCheckVerticalAndHorizontal.equals("nO")) {
			// Continue, start vertical parameters checker
			verticalChecker();
		} else {
			// Throw error
			throwError();
		}
	}

	public static void verticalChecker() {
		// Read for «yes» or «no», and replace the value to «inputCheckVertical»
		isEqual[1] = (String) Get.s(readIsEqual[1], isEqual[1], descriptionCheckIs[1]);
		String inputCheckVertical = isEqual[1];
		// Validating
		throwError(inputCheckVertical, 1, 3);
		// Inputed value checking
		if (inputCheckVertical.equals("y")
				|| inputCheckVertical.equals("Y")
				|| inputCheckVertical.equals("yes")
				|| inputCheckVertical.equals("YES")
				|| inputCheckVertical.equals("Yes")
				|| inputCheckVertical.equals("yEs")
				|| inputCheckVertical.equals("yeS")) {
			// Final result value reading
			int resultEqualNumber = (int) Get.i(readEqualNumber[1], equalNumber[1], descriptionEqualNumber[1]);
			// Validating
			throwError(resultEqualNumber, 0);
			// Extra space up/bottom parameters setting
			spaceUp = resultEqualNumber;
			spaceBottom = resultEqualNumber;
			// Continue, start horizontal parameters checker
			horizontalChecker();
		} else if (inputCheckVertical.equals("n")
				|| inputCheckVertical.equals("N")
				|| inputCheckVertical.equals("no")
				|| inputCheckVertical.equals("NO")
				|| inputCheckVertical.equals("No")
				|| inputCheckVertical.equals("nO")) {
			// Manual vertical parameters input procedure
			verticalParameters();
			// Continue, start horizontal parameters checker
			horizontalChecker();
		} else {
			// Throw error
			throwError();
		}
	}

	public static void horizontalChecker() {
		// Read for «yes» or «no», and replace the value to «inputCheck..»
		isEqual[2] = (String) Get.s(readIsEqual[2], isEqual[2], descriptionCheckIs[2]);
		String inputCheckHorizontal = isEqual[2];
		// Validating
		throwError(inputCheckHorizontal, 1, 3);
		// Inputed value checking
		if (inputCheckHorizontal.equals("y")
				|| inputCheckHorizontal.equals("Y")
				|| inputCheckHorizontal.equals("yes")
				|| inputCheckHorizontal.equals("YES")
				|| inputCheckHorizontal.equals("Yes")
				|| inputCheckHorizontal.equals("yEs")
				|| inputCheckHorizontal.equals("yeS")) {
			// Final result value reading
			int resultEqualNumber = (int) Get.i(readEqualNumber[2], equalNumber[2], descriptionEqualNumber[2]);
			// Validating
			throwError(resultEqualNumber, 0);
			// Extra space left/right parameters setting
			spaceLeft = resultEqualNumber;
			spaceRight = resultEqualNumber;
			// End
		} else if (inputCheckHorizontal.equals("n")
				|| inputCheckHorizontal.equals("N")
				|| inputCheckHorizontal.equals("no")
				|| inputCheckHorizontal.equals("NO")
				|| inputCheckHorizontal.equals("No")
				|| inputCheckHorizontal.equals("nO")) {
			// Manual horizontal parameters input procedure
			horizontalParameters();
			// End
		} else {
			// Throw error
			throwError();
		}
	}

	// * Manual parameters setters
	// Vertical
	public static void verticalParameters() {
		// Extra space up
		spaceUp = (int) Get.i(readExtra[0], spaceUp, descriptionExtra[0]);
		// Validating
		throwError(spaceUp, 0);

		// Extra space bottom
		spaceBottom = (int) Get.i(readExtra[1], spaceBottom, descriptionExtra[1]);
		// Validating
		throwError(spaceBottom, 0);
	}

	// Horizontal
	public static void horizontalParameters() {
		// Extra space left
		spaceLeft = (int) Get.i(readExtra[2], spaceLeft, descriptionExtra[2]);
		// Validating
		throwError(spaceLeft, 0);

		// Extra space right
		spaceRight = (int) Get.i(readExtra[3], spaceRight, descriptionExtra[3]);
		// Validating
		throwError(spaceRight, 0);
	}

	// * Basic-need parameters
	// Integers
	public static void figureParameters() {
		// Row amount
		rowAmount = (int) Get.i(readFigure[0], rowAmount, descriprionFigure[0]);
		// Validating
		throwError(rowAmount, 2);

		// Symbol space amount
		symbolSpaceAmount = (int) Get.i(readFigure[1], symbolSpaceAmount, descriprionFigure[1]);
		// Validating
		throwError(symbolSpaceAmount, 0);

		// End symbol figure amount
		endSymbolFigureAmount = (int) Get.i(readFigure[2], endSymbolFigureAmount, descriprionFigure[2]);
		// Validating
		throwError(endSymbolFigureAmount, 1, 2);
	}

	// Strings
	private static void symbolParameters() {
		// Figure symbol
		figureSymbol = (String) Get.s(Read.symbol.figureSymbol, figureSymbol, descriptionSymbol[0]);
		// Validating
		throwError(figureSymbol, 1, 1);

		// Space symbol
		spaceSymbol = (String) Get.s(Read.symbol.spaceSymbol, spaceSymbol, descriptionSymbol[1]);
		// Validating
		throwError(spaceSymbol, 1, 1);
	}

	// * Errors
	// Error with 1 parameter and 2 inputs
	private static void throwError(Object parameter, int until, int above) {
		if (parameter instanceof String) {
			if (((String) parameter).length() < until || ((String) parameter).length() > above) {
				throw new Error( // starts from new line
						"\n\n		Oops, you entered invalid data to field.\n" // new line
								+ "		Please, enter string, that have more length than - \""
								+ until + "\", but less than - \"" + above + "\".\n" // new line
								// Ending of message
								+ "   	   >>>  For more information check this: https://www.youtube.com/watch?v=dQw4w9WgXcQ"
								+ "\n");
			}
		} else {
			int intParameter = (int) parameter;
			if (intParameter < until || intParameter > above) {
				throw new Error( // starts from new line
						"\n\n		Oops, you entered invalid data to field.\n" // new line
								+ "		Please, enter integer, that bigger than - \""
								+ until + "\", but less than - \"" + above + "\".\n" // new line
								// Ending of message
								+ "   	   >>>  For more information, check this: https://www.youtube.com/watch?v=dQw4w9WgXcQ"
								+ "\n");
			}
		}
	}

	// Error with 1 parameter and 1 input
	private static void throwError(int parameter, int until) {
		if (parameter < until) {
			throw new Error( // starts from new line
					"\n\n		Oops, you entered invalid data to field.\n" // new line
							+ "		Please, enter values, that are more or equal to - \""
							+ until + "\".\n" // new line
							// Ending of message
							+ "   	   >>>  For more information, check this: https://www.youtube.com/watch?v=dQw4w9WgXcQ"
							+ "\n");
		}
	}

	// Error with 0 parameters and 0 inputs
	private static void throwError() {
		throw new Error( // starts from new line
				"\n\n		Oops, something went wrong..\n" // new line
						+ "		Maybe you inputed restricted value for parameter.\n" // new line
						+ "		If no, so sorry for this, we will be repaired soo soon..\n" // new line
						// Ending of message
						+ "   	   >>>  For more information, check this: https://www.youtube.com/watch?v=dQw4w9WgXcQ"
						+ "\n");
	}
}