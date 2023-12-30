package drawings;

public class ThirdDrawing {
    public static void main(String args[]) {
        drawLine(6);
        drawLine(10);
    }

    public static void drawLine(int lineWidth) {
        for (int i = 1; i <= lineWidth; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }
}
