package app.input;

// * Import
import java.util.Scanner;
import global.*;

// Code
public class Get {
    // * Integer`s input
    public static int i(Scanner reader, int inputParameter, String descripction) {
        Row.skip(1);
        Display.it("Please, enter " + descripction + ":\n");

        return inputParameter = reader.nextInt();
    }

    // * String`s input
    public static String s(Scanner reader, String inputParameter, String descripction) {
        Row.skip(1);
        Display.it("Please, enter: " + descripction + "\n");

        return inputParameter = reader.nextLine().trim();
    }
}