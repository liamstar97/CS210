//CS210(c) F2017
//Liam Thompson
//This program randomly walks forwards or backwards on a 1D plane and prints the max position when it reaches either 3 or -3.

import java.util.Random;

public class HW5Exercise008 {
    public static void main(String[] args) {
        randomWalk();
    }

    /**
     * randomly walks forwards or backwards on a 1D plane and prints the max position when it reaches either 3 or -3.
     */
    public static void randomWalk() {
        Random random = new Random();
        int pos = 0;
        int maxPos = 0;
        while (pos != 3 && pos != -3) {
            pos += (random.nextBoolean() ? 1 : -1);
            maxPos = (pos > maxPos) ? pos : maxPos;
            System.out.println("Position = " + pos);
        }
        System.out.println("max position = " + maxPos);
    }
}
