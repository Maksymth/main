package drawings;

public class SecoundDrawing {

    private static int lineWidth;

    public static void main(String[] args) {
        lineWidth = 6;
        for (int i = 1; i <= lineWidth; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        lineWidth = 10;
        for (int i = 1; i <= lineWidth; i++) {
            System.out.print("*");
        }
    }
}
