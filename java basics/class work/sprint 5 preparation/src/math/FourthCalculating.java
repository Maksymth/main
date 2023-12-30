package math;

public class FourthCalculating {
    public static void main(String args[]) throws InterruptedException {
        try {
            rollDisplayer(2);
        } catch (Exception s) {
            throw new InterruptedException("\n\n\nPlease, fix it.");
        }
    }
    /*
     * --- wrong info in sprint 5 preparation (range - [a; b] in info-file, +"kubik"), here is
     * correct one:
     * a + (int) (Math.random() * b):
     * range - [a; a + (b - 1)] or [a; a + b).
     */

    private static int rollResult() {
        double rollResult;
        rollResult = 1 + Math.random() * 6;

        return (int) rollResult;
    }

    private static void oneRollDisplayer() throws InterruptedException {
        System.out.print("Dice roll result is..  ");

        Thread.sleep(1300);

        System.out.print("is - " + rollResult() + ".");
    }

    private static void rollDisplayer(double howManyTimes) throws InterruptedException {
        long t = Math.round(howManyTimes);
        int tInt = (int) t;

        try {
            for (int i = 0; i < tInt; i++) {
                if (i == 0) {
                    System.out.print("\n");

                    oneRollDisplayer();

                    Thread.sleep(650);
                    System.out.print("\n");

                    Thread.sleep(350);
                    System.out.print("\n");
                } else if (i == tInt - 1) {
                    oneRollDisplayer();

                    Thread.sleep(650);
                    System.out.print("\n");
                } else {
                    oneRollDisplayer();

                    Thread.sleep(650);
                    System.out.print("\n");

                    Thread.sleep(350);
                    System.out.print("\n");
                }
            }
        } catch (Exception e) {
            throw new InterruptedException("\n\n\nPlease, fix it.");
        }
    }
}