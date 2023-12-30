package app;

// * Import
import global.*;
import app.figure.Figure;
import app.input.*;

// Code
public class Builder {
    // Final build, start from this file.
    public static void main(String[] args) {
        Input.user(); // setting custom parameters by console readers.

        Row.skip(45); // creating of empty space.

        Figure.creator(); // figure creating, from custom data, setted before.
    }
}