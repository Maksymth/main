package drawings;

public class FifthDrawing {
    public static void main(String args[]) {
        drawingOne(4);
        drawingOne(4, "-");
        drawingOne(4, "-", "|");
        drawingOne(4, "-", "|", ">");
    }

    public static void drawingOne(int drawingWidth) {
        for (int i = 0; i < drawingWidth; i++) {
            System.out.print(">");
        }

        System.out.print("\n");
    }

    public static void drawingOne(int drawingWidth, String displayingSymbol) {
        for (int i = 0; i < drawingWidth; i++) {
            System.out.print(displayingSymbol);
        }

        System.out.print("\n");
    }

    public static void drawingOne(int drawingWidth, String displayingSymbol, String firstSymbol) {
        System.out.print(firstSymbol);

        for (int i = 0; i < drawingWidth - 1; i++) {
            System.out.print(displayingSymbol);
        }

        System.out.print("\n");
    }

    public static void drawingOne(int drawingWidth, String displayingSymbol, String firstSymbol, String lastSymbol) {
        System.out.print(firstSymbol);

        for (int i = 0; i < drawingWidth - 2; i++) {
            System.out.print(displayingSymbol);
        }

        System.out.print(lastSymbol + "\n");
    }

    /*
     * public static void drawingOne(int drawingWidth) {
     * 
     * }
     * 
     * public static void drawingOne(int drawingWidth, String displayingSymbol) {
     * 
     * }
     * 
     * public static void dravingOne(int drawingWidth, String displayingSymbol,
     * String firstSymbol, String lastSymbol) {
     * 
     * }
     * 
     * public static void drawingTwo(int drawingWidth, String displayingSymbol) {
     * 
     * }
     */
}
