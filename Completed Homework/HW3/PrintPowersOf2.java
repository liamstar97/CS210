// CS210 F2017 Assignment HW3
// Liam Thompson
// This program prints a user inputted number of 2^n

public class PrintPowersOf2 {

    public static void main (String[] args) {
        printPowersOf2(3);
        printPowersOf2(10);
    }

    /**
     * prints i times: 2^i
     * @param i 2^i
     */
    public static void printPowersOf2(int i) {
        for (int j = 0; j <= i; j++) {
            System.out.print((int)Math.pow(2, j) + " ");
        }
        System.out.println("");
    }
}
