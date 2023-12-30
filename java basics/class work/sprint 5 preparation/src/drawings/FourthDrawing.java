package drawings;

public class FourthDrawing {
    public static void main(String args[]) {
        drawingOne(4);
        drawingTwo(4, "-");
        drawingThree(4, "-", "|", ">");
    }

    public static void drawingOne(int drawingWidth) {
        for (int i = 0; i < drawingWidth; i++) {
            System.out.print(">");
        }
        System.out.print("\n");
    }

    public static void drawingTwo(int drawingWidth, String drawingSymbol) {
        for (int i = 0; i < drawingWidth; i++) {
            System.out.print(drawingSymbol);
        }
        System.out.print("\n");
    }

    public static void drawingThree(int drawingWidth, String drawingSymbol,
            String firstDrawingSymbol, String lastDrawingSymbol) {
        System.out.print(firstDrawingSymbol);
        for (int i = 0; i <= drawingWidth - 3; i++) {
            System.out.print(drawingSymbol);
        }
        System.out.print(lastDrawingSymbol);
        System.out.print("\n");
    }
}