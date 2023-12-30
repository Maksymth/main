package app.input;

// * Import
import java.util.Scanner;

// Code
public class Read {
    // * Basic readers
    // Extra readers
    public class extra {
        public static Scanner spaceUp = new Scanner(System.in);
        public static Scanner spaceBottom = new Scanner(System.in);
        public static Scanner spaceLeft = new Scanner(System.in);
        public static Scanner spaceRight = new Scanner(System.in);
    }

    // Figure readers
    public class figure {
        public static Scanner rowAmout = new Scanner(System.in);
        public static Scanner symbolSpaceAmount = new Scanner(System.in);
        public static Scanner endSymbolFigureAmount = new Scanner(System.in);
    }

    // Symbol readers
    public class symbol {
        public static Scanner figureSymbol = new Scanner(System.in);
        public static Scanner spaceSymbol = new Scanner(System.in);
    }

    // * Check-structure readers
    public class check {
        // Is equal?
        public class isEqual {
            public static Scanner spaceVerticalAndHorizontal = new Scanner(System.in);
            public static Scanner spaceHorizontal = new Scanner(System.in);
            public static Scanner spaceVertical = new Scanner(System.in);
        }

        // Equal number
        public class equalNumber {
            public static Scanner spaceVerticalAndHorizontal = new Scanner(System.in);
            public static Scanner spaceHorizontal = new Scanner(System.in);
            public static Scanner spaceVertical = new Scanner(System.in);
        }
    }
}