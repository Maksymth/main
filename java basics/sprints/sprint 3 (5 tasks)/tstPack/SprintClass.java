package tstPack;

public class SprintClass {
    public static void main(String[] a) {
        imageDisplayer(1);
    }

    public static void imageDisplayer(int a) {
        int i = 0;
        while (i < 7) {
            i++;

            String naming ="gg";

            System.out.println("1" + naming);
        }


        if (a == 1) {
            constants.name = "\"i\" value - " + i;
        } else {
            constants.name = "\"i\" value - " + i * 2;
        }

        System.out.println(constants.name);
    }
}
