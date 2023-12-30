package tempPack;

public class tempClass {

    public static int result;

    public static void main(String[] args) {
        task1(15);
        task1(8);

        task2(2, 9);
    }

    public static void task1(int a) {
        for (int i = 0; i < a;) {
            ++i;
            System.out.print("[" + i + "]" + " ");
        }
        System.out.print("\n");
    }

    public static void task2(int poweringNum, int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++) {
            if (i == 0) {
                result = 1;
            } else {
                for (int t = 0; t < howManyTimes; t++) {
                    result = poweringNum * t;
                }
            }
            String finResult = "2 ^ " + i + " = " + result;
            System.out.println(finResult);
        }
    }
}
